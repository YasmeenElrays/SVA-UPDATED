$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Feature/TeacherRegistration.feature");
formatter.feature({
  "name": "LoginPage",
  "description": "  i want to check that user can register in SVA Website successfully",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user login and registration",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user inside login page And Click on login icon",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.UserRegistration.user_inside_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter Email , password And Click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.UserRegistration.User_Enter_Email_password_CLickOn_LoginIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.UserRegistration.Login_Successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on logout icon and enter Email,password to login with Classera",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.UserRegistration.CLick_on_loginOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User login with classera successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.UserRegistration.Login_With_Classera_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logout \u0026 Click on Sign up link",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.UserRegistration.User_logout_and_ClickOnSignUp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Fill the required data And click on SignUp Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.UserRegistration.User_Fill_fields__AndClickOnSignUp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.UserRegistration.User_Entered_Successfully()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Supplied function might have stalled\nBuild info: version: \u00274.0.0-alpha-5\u0027, revision: \u0027b3a0d621cc\u0027\nSystem info: host: \u0027DESKTOP-R535RBL\u0027, ip: \u0027192.168.1.4\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:221)\r\n\tat Steps.UserRegistration.User_Entered_Successfully(UserRegistration.java:78)\r\n\tat ✽.user Enter successfully(file:///C:/Users/yasmeen/IdeaProjects/SVA/src/test/java/Feature/TeacherRegistration.feature:11)\r\nCaused by: java.util.concurrent.TimeoutException\r\n\tat java.base/java.util.concurrent.CompletableFuture.timedGet(CompletableFuture.java:1957)\r\n\tat java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2092)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:209)\r\n\tat Steps.UserRegistration.User_Entered_Successfully(UserRegistration.java:78)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:27)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:66)\r\n\tat io.cucumber.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:124)\r\n\tat io.cucumber.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:29)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:134)\r\n\tat org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:597)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:173)\r\n\tat org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)\r\n\tat org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:816)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:146)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.base/java.util.ArrayList.forEach(ArrayList.java:1507)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:766)\r\n\tat org.testng.TestRunner.run(TestRunner.java:587)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:384)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:286)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1187)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1109)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1039)\r\n\tat org.testng.TestNG.run(TestNG.java:1007)\r\n\tat com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)\r\n\tat com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:110)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User Click on Teacher registration link to register",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.UserRegistration.ClickOn_TeacherRegistration()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "request is pending till admin approve",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.UserRegistration.your_request_is_pending_message_displayed_successfully()"
});
formatter.result({
  "status": "skipped"
});
});