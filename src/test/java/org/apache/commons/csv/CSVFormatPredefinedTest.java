/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.csv;

import org.junit.Assert;
import org.junit.Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Ignore;

/**
 * Tests {@link CSVFormat.Predefined}.
 */
public class CSVFormatPredefinedTest {

    private void test(final CSVFormat format, final String enumName) {
        Assert.assertEquals(format, CSVFormat.Predefined.valueOf(enumName).getFormat());
        Assert.assertEquals(format, CSVFormat.valueOf(enumName));
    }

    @Test(timeout = 1000)
    public void testDefault() {
        test(CSVFormat.DEFAULT, "Default");
    }

    @Test(timeout = 1000)
    public void testExcel() {
        test(CSVFormat.EXCEL, "Excel");
    }

    @Test(timeout = 1000)
    public void testMySQL() {
        test(CSVFormat.MYSQL, "MySQL");
    }

    @Test(timeout = 1000)
    public void testRFC4180() {
        test(CSVFormat.RFC4180, "RFC4180");
    }

    @Test(timeout = 1000)
    public void testTDF() {
        test(CSVFormat.TDF, "TDF");
    }
}
