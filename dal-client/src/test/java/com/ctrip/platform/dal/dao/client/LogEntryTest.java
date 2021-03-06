package com.ctrip.platform.dal.dao.client;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogEntryTest {
    @Test
    public void testGetCallerInShort() {
        LogEntry test = new LogEntry();

        assertEquals("NativeMethodAccessorImpl.invoke", test.getCallerInShort());
    }

    @Test
    public void testGetCallerInShortPopulate() {
        LogEntry.populateCurrentCaller("com.ctrip.platform.dal.dao.client.LogEntryTest.testGetCallerInShortPopulate");
        LogEntry test = new LogEntry();

        assertEquals("LogEntryTest.testGetCallerInShortPopulate", test.getCallerInShort());
        LogEntry.clearCurrentCaller();
        assertEquals("NativeMethodAccessorImpl.invoke", test.getCallerInShort());
    }
}
