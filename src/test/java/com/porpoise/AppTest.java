package com.porpoise;

import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.porpoise.common.collect.Sequences;
import com.porpoise.common.metadata.DataMother;
import com.porpoise.metadata.AppAccessors;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	private App						app;
	private final static AppMother	dataMother	= AppMother.valueOf(DataMother.withTestValues());

	/**
	 * setup the app for test
	 */
	@Before
	public void setup()
	{
		this.app = newApp();
	}

	private App newApp()
	{
		return dataMother.get();
	}

	/**
	 */
	@Test
	public void testSetAndGetGreeting()
	{
		final String expected = "tests like this are aweful";
		this.app.setGreeting(expected);
		Assert.assertEquals(expected, this.app.getGreeting());
	}

	/**
	 */
	@Test
	public void testGroupByGreeting()
	{
		// create a collection of app instances
		final ImmutableList<App> threeApps = ImmutableList.of(this.app, newApp(), newApp());

		// call the method under test
		final Map<String, App> appByGreeting = Sequences.groupByUnique(threeApps, AppAccessors.GET_GREETING);

		// assert we can get our apps back
		Assert.assertEquals("the greetings for each app should be unique", threeApps.size(), appByGreeting.size());
		for (final App instance : threeApps)
		{
			Assert.assertSame(instance, appByGreeting.get(instance.getGreeting()));
		}
	}
}
