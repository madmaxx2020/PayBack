### Test task
1. The scenario is a user freshly installed the app.
2. He/she logins and navigates to the Coupon Center.
3. Filters the coupons by partner (he/she preferred partner is REWE). 
4. And after that he/she activate the first enabled Coupon.


For install application use - src/main/resources/PAYBACK_22.08.0900.apk

SDK - 15, Language level - 15

#### Allure Report
Run the test, wait for it to complete, after that launch Allure Serve.
(Right side toolbar "Gradle": Task -> Verification -> Test -> Allure Serve)

### !!! This test can only be run once. Since there is only one REWE coupon and it cannot be reactivated.
### !!! Next test runs will fail.