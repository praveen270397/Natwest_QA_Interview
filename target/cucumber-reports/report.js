$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/features/Customer_account_update.feature");
formatter.feature({
  "name": "Customer information update",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Update Personal Information (First Name) in My Account",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logged into the application with valid username and password.",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginpageSteps.user_logged_into_the_application_with_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the account information",
  "keyword": "When "
});
formatter.match({
  "location": "CustomerAccountViewPageSteps.user_clicks_on_the_account_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on my personal information",
  "keyword": "And "
});
formatter.match({
  "location": "CustomerAccountViewPageSteps.click_on_my_personal_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "update firstname as \"Pav\" and save",
  "keyword": "And "
});
formatter.match({
  "location": "CustomerAccountViewPageSteps.update_firstname_as_and_save(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the firstname should be updated successfully and validated.",
  "keyword": "Then "
});
formatter.match({
  "location": "CustomerAccountViewPageSteps.the_firstname_should_be_updated_successfully_and_validated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/com/features/order_purchase.feature");
formatter.feature({
  "name": "Order Validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Order T-Shirt and Verify the order in Order History",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logged into the application with valid username and password.",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginpageSteps.user_logged_into_the_application_with_valid_username_and_password()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d95.0.4638.69)\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027DESKTOP-OQ4GD75\u0027, ip: \u0027192.168.0.104\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002716.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [a2cbd844ea99f084ba0dafc20a9bb518, get {url\u003dhttp://automationpractice.com}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 95.0.4638.69, chrome: {chromedriverVersion: 95.0.4638.54 (d31a821ec901f..., userDataDir: C:\\Users\\DELL\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:62788}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:62788/devtoo..., se:cdpVersion: 95.0.4638.69, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: a2cbd844ea99f084ba0dafc20a9bb518\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:78)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:328)\r\n\tat com.pages.Loginpage.launchAppUrl(Loginpage.java:23)\r\n\tat stepdefinitions.LoginpageSteps.user_logged_into_the_application_with_valid_username_and_password(LoginpageSteps.java:18)\r\n\tat ✽.user logged into the application with valid username and password.(file:src/test/resources/com/features/order_purchase.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user select the product \"T-shirt\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProductPageSteps.user_select_the_product(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "add the product to Add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartPageSteps.add_the_product_to_Add_to_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "perform cart navigation to payment page",
  "keyword": "And "
});
formatter.match({
  "location": "CartNavigationPageSteps.perform_cart_navigation_to_payment_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "confirm the order by making payment with payoption as \"Pay by bank wire\"",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentPageSteps.confirm_the_order_by_making_payment_with_payoption_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the order reference id and amount to be paid is created",
  "keyword": "And "
});
formatter.match({
  "location": "OrderCreationPageSteps.the_order_reference_id_and_amount_to_be_paid_is_created()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the order reference id and amount should be validated in orderhistory page",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderHistoryPageSteps.the_order_reference_id_and_amount_should_be_validated_in_orderhistory_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});