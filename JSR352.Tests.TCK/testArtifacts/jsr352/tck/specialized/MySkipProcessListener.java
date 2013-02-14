/*
 * Copyright 2012 International Business Machines Corp.
 * 
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership. Licensed under the Apache License, 
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jsr352.tck.specialized;

import java.util.List;
import java.util.logging.Logger;

import javax.batch.api.SkipProcessListener;
import javax.batch.runtime.context.JobContext;
import javax.batch.runtime.context.StepContext;
import javax.inject.Inject;

import org.testng.Reporter;

import jsr352.tck.reusable.MyParentException;

@javax.inject.Named("mySkipProcessListener")
public class MySkipProcessListener implements SkipProcessListener {

    @Inject
    JobContext jobCtx;

    @Inject
    StepContext stepCtx;

    private final static String sourceClass = MySkipProcessListener.class.getName();
    private final static Logger logger = Logger.getLogger(sourceClass);

    public static final String GOOD_EXIT_STATUS = "GOOD STATUS";
    public static final String BAD_EXIT_STATUS = "BAD STATUS";

    @Override
    public void onSkipProcessItem(Object item, Exception e) {
        Reporter.log("In onSkipProcessItem()" + e + "<p>");

        if (e instanceof MyParentException) {
        	Reporter.log("SKIPLISTENER: onSkipProcessItem, exception is an instance of: MyParentException<p>");
            jobCtx.setExitStatus(GOOD_EXIT_STATUS);
        } else {
        	Reporter.log("SKIPLISTENER: onSkipProcessItem, exception is NOT an instance of: MyParentException<p>");
            jobCtx.setExitStatus(BAD_EXIT_STATUS);
        }
    }
}