insert into base.illegal_batch_info (BATCH_NUMBER, BLOCKER, CRITICAL, MAJOR, MINOR, INFO, CREATE_DATE, STATE)
values (10000001, null, 36, null, null, null, to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 1);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000016, '20180228063544', 'shibr', 'code', 'crm_6x_core', 'code/crm_6x_core/src/com/asiainfo/core/resource/mres/application/nonhomo/num/service/impl/NumQuerySVImpl.java', 338, 'CRITICAL', 'Floating point numbers should not be tested for equality', 'Equality tests should not be made with floating point values.', '<p>Floating point math is imprecise because of the challenges of storing such values in a binary representation. Even worse, floating point math is not associative; push a <code>float</code> or a <code>double</code> through a series of simple mathematical operations and the answer will be different based on the order of those operation because of the rounding that takes place at each step.</p>
<p>Even simple floating point assignments are not simple:</p>
<pre>
float f = 0.1; // 0.100000001490116119384765625
double d = 0.1; // 0.1000000000000000055511151231257827021181583404541015625
</pre>
<p>(Results will vary based on compiler and compiler settings);</p>
<p>Therefore, the use of the equality (<code>==</code>) and inequality (<code>!=</code>) operators on <code>float</code> or <code>double</code> values is almost always an error, and the use of other comparison operators (<code>&gt;</code>, <code>&gt;=</code>, <code>&lt;</code>, <code>&lt;=</code>) is also problematic because they don''t work properly for -0 and <code>NaN</code>. </p>
<p>Instead the best course is to avoid floating point comparisons altogether. When that is not possible, you should consider using one of Java''s float-handling <code>Numbers</code> such as <code>BigDecimal</code> which can properly handle floating point comparisons. A third option is to look not for equality but for whether the value is close enough. I.e. compare the absolute value of the difference between the stored value and the expected value against a margin of acceptable error. Note that this does not cover all cases (<code>NaN</code> and <code>Infinity</code> for instance).</p>
<p>This rule checks for the use of direct and indirect equality/inequailty tests on floats and doubles.</p>

<h2>Noncompliant Code Example</h2>
<pre>
float myNumber = 3.146;
if ( myNumber == 3.146f ) { //Noncompliant. Because of floating point imprecision, this will be false
  // ...
}
if ( myNumber != 3.146f ) { //Noncompliant. Because of floating point imprecision, this will be true
  // ...
}

if (myNumber &lt; 4 || myNumber &gt; 4) { // Noncompliant; indirect inequality test
  // ...
}

float zeroFloat = 0.0f;
if (zeroFloat == 0) {  // Noncompliant. Computations may end up with a value close but not equal to zero.
}
</pre>

<h2>Exceptions</h2>
<p>Since <code>NaN</code> is not equal to itself, the specific case of testing a floating point value against itself is a valid test for <code>NaN</code> and is therefore ignored.</p>
<pre>
float f;
double d;
if(f != f) { // Compliant; test for NaN value
  System.out.println("f is NaN");
} else if (f != d) { // Noncompliant
  // ...
}
</pre>

<h2>See</h2>
<ul>
<li> MISRA C:2004, 13.3 - Floating-point expressions shall not be tested for equality or inequality.
</li><li> MISRA C++:2008, 6-2-2 - Floating-point expressions shall not be directly or indirectly tested for equality or inequality
</li></ul>', null, null, 'bug,misra', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000017, '20180228042132', 'saijirihu', 'code', 'crmweb', 'code/crmweb/src/com/ai/saas/component/sales/person/custinfo/CustInfo.java', 872, 'CRITICAL', 'The value returned from a stream read should be checked', 'Check the return value of the "read" call to see how many bytes were read.', '<p>You cannot assume that any given stream reading call will fill the <code>byte[]</code> passed in to the method. Instead, you must check the value returned by the read method to see how many bytes were read. Fail to do so, and you introduce bug that is both harmful and difficult to reproduce.</p>
<p>Similarly, you cannot assume that <code>InputStream.skip</code> will actually skip the requested number of bytes, but must check the value returned from the method.</p>
<p>This rule raises an issue when an <code>InputStream.read</code> method that accepts a <code>byte[]</code> is called, but the return value is not checked, and when the return value of <code>InputStream.skip</code> is not checked. The rule also applies to <code>InputStream</code> child classes.</p>

<h2>Noncompliant Code Example</h2>
<pre>
public void doSomething(String fileName) {
  try {
    InputStream is = new InputStream(file);
    byte [] buffer = new byte[1000];
    is.read(buffer);  // Noncompliant
    // ...
  } catch (IOException e) { ... }
}
</pre>

<h2>Compliant Solution</h2>
<pre>
public void doSomething(String fileName) {
  try {
    InputStream is = new InputStream(file);
    byte [] buffer = new byte[1000];
    int count = 0;
    while (count = is.read(buffer) &gt; 0) {
      // ...
    }
  } catch (IOException e) { ... }
}
</pre>

<h2>See</h2>
<ul>
<li> <a href="https://www.securecoding.cert.org/confluence/x/XACSAQ">CERT, FIO10-J.</a> - Ensure the array is filled when using read() to fill an array
</li></ul>', null, null, 'bug,cert', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, '已提交开发分支');

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000018, '20180228212013', 'panjy3', 'code', 'sso', 'code/sso/src/com/asiainfo/portal/framework/external/PortalFirstFilter.java', 353, 'CRITICAL', 'Throwable.printStackTrace(...) should not be called', 'Use a logger to log this exception.', '<p><code>Throwable.printStackTrace(...)</code> prints a throwable and its stack trace to some stream.</p>
<p>Loggers should be used instead to print throwables, as they have many advantages:</p>
<ul>
<li> Users are able to easily retrieve the logs.
</li><li> The format of log messages is uniform and allow users to browse the logs easily.
</li></ul>

<h2>Noncompliant Code Example</h2>
<pre>
try {
  /* ... */
} catch(Exception e) {
  e.printStackTrace();        // Noncompliant
}
</pre>

<h2>Compliant Solution</h2>
<pre>
try {
  /* ... */
} catch(Exception e) {
  LOGGER.log("context", e);
}
</pre>', null, null, 'error-handling,security', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000019, '20180228212013', 'panjy3', 'code', 'sso', 'code/sso/src/com/asiainfo/portal/framework/external/PortalFirstFilter.java', 97, 'CRITICAL', 'Instance methods should not write to "static" fields', 'Make the enclosing method "static" or remove this set.', '<p>Correctly updating a <code>static</code> field from a non-static method is tricky to get right and could easily lead to bugs if there are multiple class instances  and/or multiple threads in play. Ideally, <code>static</code> fields are only updated from <code>synchronized static</code> methods.</p>
<p>This rule raises an issue each time a <code>static</code> field is updated from a non-static method.</p>

<h2>Noncompliant Code Example</h2>
<pre>
public class MyClass {

  private static int count = 0;

  public void doSomething() {
    //...
    count++;  // Noncompliant
  }
}
</pre>', null, null, 'bug,multi-threading', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000020, '20180228212013', 'panjy3', 'code', 'sso', 'code/sso/src/com/asiainfo/portal/framework/external/PortalFirstFilter.java', 72, 'CRITICAL', ':', 'Make this "public static new4AParamEncode" field final', 'null', null, null, 'null', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000021, '20180228212013', 'panjy3', 'code', 'sso', 'code/sso/src/com/asiainfo/portal/framework/external/PortalFirstFilter.java', 71, 'CRITICAL', ':', 'Make this "public static OPEN_REDIUS" field final', 'null', null, null, 'null', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000022, '20180228212013', 'panjy3', 'code', 'sso', 'code/sso/src/com/asiainfo/portal/framework/external/PortalFirstFilter.java', 87, 'CRITICAL', 'Instance methods should not write to "static" fields', 'Make the enclosing method "static" or remove this set.', '<p>Correctly updating a <code>static</code> field from a non-static method is tricky to get right and could easily lead to bugs if there are multiple class instances  and/or multiple threads in play. Ideally, <code>static</code> fields are only updated from <code>synchronized static</code> methods.</p>
<p>This rule raises an issue each time a <code>static</code> field is updated from a non-static method.</p>

<h2>Noncompliant Code Example</h2>
<pre>
public class MyClass {

  private static int count = 0;

  public void doSomething() {
    //...
    count++;  // Noncompliant
  }
}
</pre>', null, null, 'bug,multi-threading', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000023, '20180228212013', 'panjy3', 'code', 'sso', 'code/sso/src/com/asiainfo/portal/framework/external/PortalFirstFilter.java', 74, 'CRITICAL', ':', 'Make this "public static checkErrorCount" field final', 'null', null, null, 'null', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000024, '20180228212013', 'panjy3', 'code', 'sso', 'code/sso/src/com/asiainfo/portal/framework/external/PortalFirstFilter.java', 84, 'CRITICAL', 'Instance methods should not write to "static" fields', 'Make the enclosing method "static" or remove this set.', '<p>Correctly updating a <code>static</code> field from a non-static method is tricky to get right and could easily lead to bugs if there are multiple class instances  and/or multiple threads in play. Ideally, <code>static</code> fields are only updated from <code>synchronized static</code> methods.</p>
<p>This rule raises an issue each time a <code>static</code> field is updated from a non-static method.</p>

<h2>Noncompliant Code Example</h2>
<pre>
public class MyClass {

  private static int count = 0;

  public void doSomething() {
    //...
    count++;  // Noncompliant
  }
}
</pre>', null, null, 'bug,multi-threading', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000025, '20180228212013', 'panjy3', 'code', 'sso', 'code/sso/src/com/asiainfo/portal/framework/external/PortalFirstFilter.java', 47, 'CRITICAL', ':', 'Make this "public static isLog" field final', 'null', null, null, 'null', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000026, '20180228212013', 'panjy3', 'code', 'sso', 'code/sso/src/com/asiainfo/portal/framework/external/PortalFirstFilter.java', 91, 'CRITICAL', 'Instance methods should not write to "static" fields', 'Make the enclosing method "static" or remove this set.', '<p>Correctly updating a <code>static</code> field from a non-static method is tricky to get right and could easily lead to bugs if there are multiple class instances  and/or multiple threads in play. Ideally, <code>static</code> fields are only updated from <code>synchronized static</code> methods.</p>
<p>This rule raises an issue each time a <code>static</code> field is updated from a non-static method.</p>

<h2>Noncompliant Code Example</h2>
<pre>
public class MyClass {

  private static int count = 0;

  public void doSomething() {
    //...
    count++;  // Noncompliant
  }
}
</pre>', null, null, 'bug,multi-threading', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000027, '20180228212013', 'panjy3', 'code', 'sso', 'code/sso/src/com/asiainfo/portal/framework/external/PortalFirstFilter.java', 89, 'CRITICAL', 'Instance methods should not write to "static" fields', 'Make the enclosing method "static" or remove this set.', '<p>Correctly updating a <code>static</code> field from a non-static method is tricky to get right and could easily lead to bugs if there are multiple class instances  and/or multiple threads in play. Ideally, <code>static</code> fields are only updated from <code>synchronized static</code> methods.</p>
<p>This rule raises an issue each time a <code>static</code> field is updated from a non-static method.</p>

<h2>Noncompliant Code Example</h2>
<pre>
public class MyClass {

  private static int count = 0;

  public void doSomething() {
    //...
    count++;  // Noncompliant
  }
}
</pre>', null, null, 'bug,multi-threading', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000028, '20180228212013', 'panjy3', 'code', 'sso', 'code/sso/src/com/asiainfo/portal/framework/external/PortalFirstFilter.java', 99, 'CRITICAL', 'Instance methods should not write to "static" fields', 'Make the enclosing method "static" or remove this set.', '<p>Correctly updating a <code>static</code> field from a non-static method is tricky to get right and could easily lead to bugs if there are multiple class instances  and/or multiple threads in play. Ideally, <code>static</code> fields are only updated from <code>synchronized static</code> methods.</p>
<p>This rule raises an issue each time a <code>static</code> field is updated from a non-static method.</p>

<h2>Noncompliant Code Example</h2>
<pre>
public class MyClass {

  private static int count = 0;

  public void doSomething() {
    //...
    count++;  // Noncompliant
  }
}
</pre>', null, null, 'bug,multi-threading', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000029, '20180228212013', 'panjy3', 'code', 'sso', 'code/sso/src/com/asiainfo/portal/framework/external/PortalFirstFilter.java', 157, 'CRITICAL', 'Instance methods should not write to "static" fields', 'Make the enclosing method "static" or remove this set.', '<p>Correctly updating a <code>static</code> field from a non-static method is tricky to get right and could easily lead to bugs if there are multiple class instances  and/or multiple threads in play. Ideally, <code>static</code> fields are only updated from <code>synchronized static</code> methods.</p>
<p>This rule raises an issue each time a <code>static</code> field is updated from a non-static method.</p>

<h2>Noncompliant Code Example</h2>
<pre>
public class MyClass {

  private static int count = 0;

  public void doSomething() {
    //...
    count++;  // Noncompliant
  }
}
</pre>', null, null, 'bug,multi-threading', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000030, '20180228212013', 'panjy3', 'code', 'sso', 'code/sso/src/com/asiainfo/portal/framework/external/PortalFirstFilter.java', 100, 'CRITICAL', 'Instance methods should not write to "static" fields', 'Make the enclosing method "static" or remove this set.', '<p>Correctly updating a <code>static</code> field from a non-static method is tricky to get right and could easily lead to bugs if there are multiple class instances  and/or multiple threads in play. Ideally, <code>static</code> fields are only updated from <code>synchronized static</code> methods.</p>
<p>This rule raises an issue each time a <code>static</code> field is updated from a non-static method.</p>

<h2>Noncompliant Code Example</h2>
<pre>
public class MyClass {

  private static int count = 0;

  public void doSomething() {
    //...
    count++;  // Noncompliant
  }
}
</pre>', null, null, 'bug,multi-threading', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000002, '20180225220139', 'wangzhanfeng', 'code', 'assetcenter', 'code/assetcenter/assetcenter/src/com/asiainfo/asset/component/bc/note/impl/NotePrintBCImpl.java', 5962, 'CRITICAL', 'The value returned from a stream read should be checked', 'Check the return value of the "read" call to see how many bytes were read.', '<p>You cannot assume that any given stream reading call will fill the <code>byte[]</code> passed in to the method. Instead, you must check the value returned by the read method to see how many bytes were read. Fail to do so, and you introduce bug that is both harmful and difficult to reproduce.</p>
<p>Similarly, you cannot assume that <code>InputStream.skip</code> will actually skip the requested number of bytes, but must check the value returned from the method.</p>
<p>This rule raises an issue when an <code>InputStream.read</code> method that accepts a <code>byte[]</code> is called, but the return value is not checked, and when the return value of <code>InputStream.skip</code> is not checked. The rule also applies to <code>InputStream</code> child classes.</p>

<h2>Noncompliant Code Example</h2>
<pre>
public void doSomething(String fileName) {
  try {
    InputStream is = new InputStream(file);
    byte [] buffer = new byte[1000];
    is.read(buffer);  // Noncompliant
    // ...
  } catch (IOException e) { ... }
}
</pre>

<h2>Compliant Solution</h2>
<pre>
public void doSomething(String fileName) {
  try {
    InputStream is = new InputStream(file);
    byte [] buffer = new byte[1000];
    int count = 0;
    while (count = is.read(buffer) &gt; 0) {
      // ...
    }
  } catch (IOException e) { ... }
}
</pre>

<h2>See</h2>
<ul>
<li> <a href="https://www.securecoding.cert.org/confluence/x/XACSAQ">CERT, FIO10-J.</a> - Ensure the array is filled when using read() to fill an array
</li></ul>', null, null, 'bug,cert', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000003, '20180225220139', 'wangzhanfeng', 'code', 'assetcenter', 'code/assetcenter/assetcenter/src/com/asiainfo/asset/component/bc/note/impl/NotePrintBCImpl.java', 5107, 'CRITICAL', 'Throwable.printStackTrace(...) should not be called', 'Use a logger to log this exception.', '<p><code>Throwable.printStackTrace(...)</code> prints a throwable and its stack trace to some stream.</p>
<p>Loggers should be used instead to print throwables, as they have many advantages:</p>
<ul>
<li> Users are able to easily retrieve the logs.
</li><li> The format of log messages is uniform and allow users to browse the logs easily.
</li></ul>

<h2>Noncompliant Code Example</h2>
<pre>
try {
  /* ... */
} catch(Exception e) {
  e.printStackTrace();        // Noncompliant
}
</pre>

<h2>Compliant Solution</h2>
<pre>
try {
  /* ... */
} catch(Exception e) {
  LOGGER.log("context", e);
}
</pre>', null, null, 'error-handling,security', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000004, '20180225220139', 'wangzhanfeng', 'code', 'assetcenter', 'code/assetcenter/assetcenter/src/com/asiainfo/asset/component/bc/note/impl/NotePrintBCImpl.java', 6113, 'CRITICAL', 'The value returned from a stream read should be checked', 'Check the return value of the "read" call to see how many bytes were read.', '<p>You cannot assume that any given stream reading call will fill the <code>byte[]</code> passed in to the method. Instead, you must check the value returned by the read method to see how many bytes were read. Fail to do so, and you introduce bug that is both harmful and difficult to reproduce.</p>
<p>Similarly, you cannot assume that <code>InputStream.skip</code> will actually skip the requested number of bytes, but must check the value returned from the method.</p>
<p>This rule raises an issue when an <code>InputStream.read</code> method that accepts a <code>byte[]</code> is called, but the return value is not checked, and when the return value of <code>InputStream.skip</code> is not checked. The rule also applies to <code>InputStream</code> child classes.</p>

<h2>Noncompliant Code Example</h2>
<pre>
public void doSomething(String fileName) {
  try {
    InputStream is = new InputStream(file);
    byte [] buffer = new byte[1000];
    is.read(buffer);  // Noncompliant
    // ...
  } catch (IOException e) { ... }
}
</pre>

<h2>Compliant Solution</h2>
<pre>
public void doSomething(String fileName) {
  try {
    InputStream is = new InputStream(file);
    byte [] buffer = new byte[1000];
    int count = 0;
    while (count = is.read(buffer) &gt; 0) {
      // ...
    }
  } catch (IOException e) { ... }
}
</pre>

<h2>See</h2>
<ul>
<li> <a href="https://www.securecoding.cert.org/confluence/x/XACSAQ">CERT, FIO10-J.</a> - Ensure the array is filled when using read() to fill an array
</li></ul>', null, null, 'bug,cert', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000005, '20180225220139', 'wangzhanfeng', 'code', 'assetcenter', 'code/assetcenter/assetcenter/src/com/asiainfo/asset/component/bc/note/impl/NotePrintBCImpl.java', 5103, 'CRITICAL', 'The value returned from a stream read should be checked', 'Check the return value of the "read" call to see how many bytes were read.', '<p>You cannot assume that any given stream reading call will fill the <code>byte[]</code> passed in to the method. Instead, you must check the value returned by the read method to see how many bytes were read. Fail to do so, and you introduce bug that is both harmful and difficult to reproduce.</p>
<p>Similarly, you cannot assume that <code>InputStream.skip</code> will actually skip the requested number of bytes, but must check the value returned from the method.</p>
<p>This rule raises an issue when an <code>InputStream.read</code> method that accepts a <code>byte[]</code> is called, but the return value is not checked, and when the return value of <code>InputStream.skip</code> is not checked. The rule also applies to <code>InputStream</code> child classes.</p>

<h2>Noncompliant Code Example</h2>
<pre>
public void doSomething(String fileName) {
  try {
    InputStream is = new InputStream(file);
    byte [] buffer = new byte[1000];
    is.read(buffer);  // Noncompliant
    // ...
  } catch (IOException e) { ... }
}
</pre>

<h2>Compliant Solution</h2>
<pre>
public void doSomething(String fileName) {
  try {
    InputStream is = new InputStream(file);
    byte [] buffer = new byte[1000];
    int count = 0;
    while (count = is.read(buffer) &gt; 0) {
      // ...
    }
  } catch (IOException e) { ... }
}
</pre>

<h2>See</h2>
<ul>
<li> <a href="https://www.securecoding.cert.org/confluence/x/XACSAQ">CERT, FIO10-J.</a> - Ensure the array is filled when using read() to fill an array
</li></ul>', null, null, 'bug,cert', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000006, '20180228093145', 'wangzhanfeng', 'code', 'assetcenter', 'code/assetcenter/assetcenter/src/com/asiainfo/asset/component/bc/note/impl/ElecNotePrintBCImpl.java', 2329, 'CRITICAL', 'The value returned from a stream read should be checked', 'Check the return value of the "read" call to see how many bytes were read.', '<p>You cannot assume that any given stream reading call will fill the <code>byte[]</code> passed in to the method. Instead, you must check the value returned by the read method to see how many bytes were read. Fail to do so, and you introduce bug that is both harmful and difficult to reproduce.</p>
<p>Similarly, you cannot assume that <code>InputStream.skip</code> will actually skip the requested number of bytes, but must check the value returned from the method.</p>
<p>This rule raises an issue when an <code>InputStream.read</code> method that accepts a <code>byte[]</code> is called, but the return value is not checked, and when the return value of <code>InputStream.skip</code> is not checked. The rule also applies to <code>InputStream</code> child classes.</p>

<h2>Noncompliant Code Example</h2>
<pre>
public void doSomething(String fileName) {
  try {
    InputStream is = new InputStream(file);
    byte [] buffer = new byte[1000];
    is.read(buffer);  // Noncompliant
    // ...
  } catch (IOException e) { ... }
}
</pre>

<h2>Compliant Solution</h2>
<pre>
public void doSomething(String fileName) {
  try {
    InputStream is = new InputStream(file);
    byte [] buffer = new byte[1000];
    int count = 0;
    while (count = is.read(buffer) &gt; 0) {
      // ...
    }
  } catch (IOException e) { ... }
}
</pre>

<h2>See</h2>
<ul>
<li> <a href="https://www.securecoding.cert.org/confluence/x/XACSAQ">CERT, FIO10-J.</a> - Ensure the array is filled when using read() to fill an array
</li></ul>', null, null, 'bug,cert', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000007, '20180228093145', 'wangzhanfeng', 'code', 'assetcenter', 'code/assetcenter/assetcenter/src/com/asiainfo/asset/component/bc/note/impl/ElecNotePrintBCImpl.java', 2190, 'CRITICAL', 'Throwable.printStackTrace(...) should not be called', 'Use a logger to log this exception.', '<p><code>Throwable.printStackTrace(...)</code> prints a throwable and its stack trace to some stream.</p>
<p>Loggers should be used instead to print throwables, as they have many advantages:</p>
<ul>
<li> Users are able to easily retrieve the logs.
</li><li> The format of log messages is uniform and allow users to browse the logs easily.
</li></ul>

<h2>Noncompliant Code Example</h2>
<pre>
try {
  /* ... */
} catch(Exception e) {
  e.printStackTrace();        // Noncompliant
}
</pre>

<h2>Compliant Solution</h2>
<pre>
try {
  /* ... */
} catch(Exception e) {
  LOGGER.log("context", e);
}
</pre>', null, null, 'error-handling,security', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000008, '20180228093145', 'wangzhanfeng', 'code', 'assetcenter', 'code/assetcenter/assetcenter/src/com/asiainfo/asset/component/bc/note/impl/ElecNotePrintBCImpl.java', 2186, 'CRITICAL', 'The value returned from a stream read should be checked', 'Check the return value of the "read" call to see how many bytes were read.', '<p>You cannot assume that any given stream reading call will fill the <code>byte[]</code> passed in to the method. Instead, you must check the value returned by the read method to see how many bytes were read. Fail to do so, and you introduce bug that is both harmful and difficult to reproduce.</p>
<p>Similarly, you cannot assume that <code>InputStream.skip</code> will actually skip the requested number of bytes, but must check the value returned from the method.</p>
<p>This rule raises an issue when an <code>InputStream.read</code> method that accepts a <code>byte[]</code> is called, but the return value is not checked, and when the return value of <code>InputStream.skip</code> is not checked. The rule also applies to <code>InputStream</code> child classes.</p>

<h2>Noncompliant Code Example</h2>
<pre>
public void doSomething(String fileName) {
  try {
    InputStream is = new InputStream(file);
    byte [] buffer = new byte[1000];
    is.read(buffer);  // Noncompliant
    // ...
  } catch (IOException e) { ... }
}
</pre>

<h2>Compliant Solution</h2>
<pre>
public void doSomething(String fileName) {
  try {
    InputStream is = new InputStream(file);
    byte [] buffer = new byte[1000];
    int count = 0;
    while (count = is.read(buffer) &gt; 0) {
      // ...
    }
  } catch (IOException e) { ... }
}
</pre>

<h2>See</h2>
<ul>
<li> <a href="https://www.securecoding.cert.org/confluence/x/XACSAQ">CERT, FIO10-J.</a> - Ensure the array is filled when using read() to fill an array
</li></ul>', null, null, 'bug,cert', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000009, '20180228093145', 'wangzhanfeng', 'code', 'assetcenter', 'code/assetcenter/assetcenter/src/com/asiainfo/asset/component/bc/note/impl/ElecNotePrintBCImpl.java', 2333, 'CRITICAL', 'Throwable.printStackTrace(...) should not be called', 'Use a logger to log this exception.', '<p><code>Throwable.printStackTrace(...)</code> prints a throwable and its stack trace to some stream.</p>
<p>Loggers should be used instead to print throwables, as they have many advantages:</p>
<ul>
<li> Users are able to easily retrieve the logs.
</li><li> The format of log messages is uniform and allow users to browse the logs easily.
</li></ul>

<h2>Noncompliant Code Example</h2>
<pre>
try {
  /* ... */
} catch(Exception e) {
  e.printStackTrace();        // Noncompliant
}
</pre>

<h2>Compliant Solution</h2>
<pre>
try {
  /* ... */
} catch(Exception e) {
  LOGGER.log("context", e);
}
</pre>', null, null, 'error-handling,security', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000010, '20180226214601', 'luyang', 'code', 'exeprogress', 'code/exeprogress/src/com/asiainfo/order/exe/task/person/mobilemarket/BroadRenewDocDownTask.java', 120, 'CRITICAL', 'Printf-style format strings should not lead to unexpected behavior at runtime', 'Not enough arguments.', '<p>Because <code>printf</code>-style format strings are interpreted at runtime, rather than validated by the Java compiler, they can contain errors that lead to unexpected behavior or runtime errors. This rule statically validates the good behavior of <code>printf</code>-style formats when calling the <code>format(...)</code> methods of <code>java.util.Formatter</code>, <code>java.lang.String</code>, <code>java.io.PrintStream</code> and <code>java.io.PrintWriter</code> classes and the <code>printf(...)</code> methods of <code>java.io.PrintStream</code> or <code>java.io.PrintWriter</code> classes. </p>

<h2>Noncompliant Code Example</h2>
<pre>
String.format("The value of my integer is %d", "Hello World");  // Noncompliant; an ''int'' is expected rather than a String
String.format("First {0} and then {1}", "foo", "bar");  //Noncompliant. Looks like there is a confusion with the use of {{java.text.MessageFormat}}, parameters "foo" and "bar" will be simply ignored here
String.format("Duke''s Birthday year is %tX", c);  //Noncompliant; X is not a supported time conversion character
String.format("Display %3$d and then %d", 1, 2, 3);   //Noncompliant; the second argument ''2'' is unused
String.format("Display %0$d and then %d", 1);   //Noncompliant; arguments are numbered starting from 1
String.format("Too many arguments %d and %d", 1, 2, 3);  //Noncompliant; the third argument ''3'' is unused
String.format("Not enough arguments %d and %d", 1);  //Noncompliant; the second argument is missing
String.format("First Line\n");   //Noncompliant; %n should be used in place of \n to produce the platform-specific line separator
String.format("%&lt; is equals to %d", 2);   //Noncompliant; the argument index ''&lt;'' refers to the previous format specifier but there isn''t one
String.format("Is myObject null ? %b", myObject);   //Noncompliant; when a non-boolean argument is formatted with %b, it prints true for any nonnull value, and false for null. Even if intended, this is misleading. It''s better to directly inject the boolean value (myObject == null in this case)
String.format("value is " + value); // Noncompliant
String s = String.format("string without arguments"); // Noncompliant
</pre>

<h2>Compliant Solution</h2>
<pre>
String.format("The value of my integer is %d", 3);
String.format("First %s and then %s", "foo", "bar");
String.format("Duke''s Birthday year is %tY", c);
String.format("Display %2$d and then %d", 1, 3);
String.format("Display %1$d and then %d", 1);
String.format("Too many arguments %d %d", 1, 2);
String.format("Not enough arguments %d and %d", 1, 2);
String.format("First Line%n");
String.format("%d is equals to %&lt;", 2);
String.format("Is myObject null ? %b", myObject == null);
String.format("value is %d", value);
String s = "string without arguments";
</pre>

<h2>See</h2>
<ul>
<li> <a href="https://www.securecoding.cert.org/confluence/x/wQA1">CERT, FIO47-C.</a> - Use valid format strings
</li><li> <a href="https://www.securecoding.cert.org/confluence/x/e4EyAQ">CERT, FIO00-CPP.</a> - Take care when creating format strings
</li></ul>', null, null, 'bug,cert,pitfall', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000011, '20180226030028', 'huzq', 'code', 'assetcenter', 'code/assetcenter/assetcenter/src/com/asiainfo/asset/center/external/iboss/impl/IBOSSServiceCSVImpl.java', 1409, 'CRITICAL', 'Throwable.printStackTrace(...) should not be called', 'Use a logger to log this exception.', '<p><code>Throwable.printStackTrace(...)</code> prints a throwable and its stack trace to some stream.</p>
<p>Loggers should be used instead to print throwables, as they have many advantages:</p>
<ul>
<li> Users are able to easily retrieve the logs.
</li><li> The format of log messages is uniform and allow users to browse the logs easily.
</li></ul>

<h2>Noncompliant Code Example</h2>
<pre>
try {
  /* ... */
} catch(Exception e) {
  e.printStackTrace();        // Noncompliant
}
</pre>

<h2>Compliant Solution</h2>
<pre>
try {
  /* ... */
} catch(Exception e) {
  LOGGER.log("context", e);
}
</pre>', null, null, 'error-handling,security', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000012, '20180226030028', 'huzq', 'code', 'assetcenter', 'code/assetcenter/assetcenter/src/com/asiainfo/asset/center/external/iboss/impl/IBOSSServiceCSVImpl.java', 1124, 'CRITICAL', 'Throwable.printStackTrace(...) should not be called', 'Use a logger to log this exception.', '<p><code>Throwable.printStackTrace(...)</code> prints a throwable and its stack trace to some stream.</p>
<p>Loggers should be used instead to print throwables, as they have many advantages:</p>
<ul>
<li> Users are able to easily retrieve the logs.
</li><li> The format of log messages is uniform and allow users to browse the logs easily.
</li></ul>

<h2>Noncompliant Code Example</h2>
<pre>
try {
  /* ... */
} catch(Exception e) {
  e.printStackTrace();        // Noncompliant
}
</pre>

<h2>Compliant Solution</h2>
<pre>
try {
  /* ... */
} catch(Exception e) {
  LOGGER.log("context", e);
}
</pre>', null, null, 'error-handling,security', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000013, '20180226030028', 'huzq', 'code', 'assetcenter', 'code/assetcenter/assetcenter/src/com/asiainfo/asset/center/external/iboss/impl/IBOSSServiceCSVImpl.java', 2824, 'CRITICAL', 'Throwable.printStackTrace(...) should not be called', 'Use a logger to log this exception.', '<p><code>Throwable.printStackTrace(...)</code> prints a throwable and its stack trace to some stream.</p>
<p>Loggers should be used instead to print throwables, as they have many advantages:</p>
<ul>
<li> Users are able to easily retrieve the logs.
</li><li> The format of log messages is uniform and allow users to browse the logs easily.
</li></ul>

<h2>Noncompliant Code Example</h2>
<pre>
try {
  /* ... */
} catch(Exception e) {
  e.printStackTrace();        // Noncompliant
}
</pre>

<h2>Compliant Solution</h2>
<pre>
try {
  /* ... */
} catch(Exception e) {
  LOGGER.log("context", e);
}
</pre>', null, null, 'error-handling,security', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000014, '20180226030028', 'huzq', 'code', 'assetcenter', 'code/assetcenter/assetcenter/src/com/asiainfo/asset/center/external/iboss/impl/IBOSSServiceCSVImpl.java', 1918, 'CRITICAL', 'Throwable.printStackTrace(...) should not be called', 'Use a logger to log this exception.', '<p><code>Throwable.printStackTrace(...)</code> prints a throwable and its stack trace to some stream.</p>
<p>Loggers should be used instead to print throwables, as they have many advantages:</p>
<ul>
<li> Users are able to easily retrieve the logs.
</li><li> The format of log messages is uniform and allow users to browse the logs easily.
</li></ul>

<h2>Noncompliant Code Example</h2>
<pre>
try {
  /* ... */
} catch(Exception e) {
  e.printStackTrace();        // Noncompliant
}
</pre>

<h2>Compliant Solution</h2>
<pre>
try {
  /* ... */
} catch(Exception e) {
  LOGGER.log("context", e);
}
</pre>', null, null, 'error-handling,security', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000015, '20180301044746', 'huzq', 'code', 'assetcenter', 'code/assetcenter/assetcenter/src/com/asiainfo/asset/component/po/bo/ad/QBOCaBillProdBean.java', 33, 'CRITICAL', ':', 'Make this "public static S_TYPE" field final', 'null', null, null, 'null', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000031, '20180228212013', 'panjy3', 'code', 'sso', 'code/sso/src/com/asiainfo/portal/framework/external/PortalFirstFilter.java', 101, 'CRITICAL', 'Instance methods should not write to "static" fields', 'Make the enclosing method "static" or remove this set.', '<p>Correctly updating a <code>static</code> field from a non-static method is tricky to get right and could easily lead to bugs if there are multiple class instances  and/or multiple threads in play. Ideally, <code>static</code> fields are only updated from <code>synchronized static</code> methods.</p>
<p>This rule raises an issue each time a <code>static</code> field is updated from a non-static method.</p>

<h2>Noncompliant Code Example</h2>
<pre>
public class MyClass {

  private static int count = 0;

  public void doSomething() {
    //...
    count++;  // Noncompliant
  }
}
</pre>', null, null, 'bug,multi-threading', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000032, '20180228212013', 'panjy3', 'code', 'sso', 'code/sso/src/com/asiainfo/portal/framework/external/PortalFirstFilter.java', 86, 'CRITICAL', 'Instance methods should not write to "static" fields', 'Make the enclosing method "static" or remove this set.', '<p>Correctly updating a <code>static</code> field from a non-static method is tricky to get right and could easily lead to bugs if there are multiple class instances  and/or multiple threads in play. Ideally, <code>static</code> fields are only updated from <code>synchronized static</code> methods.</p>
<p>This rule raises an issue each time a <code>static</code> field is updated from a non-static method.</p>

<h2>Noncompliant Code Example</h2>
<pre>
public class MyClass {

  private static int count = 0;

  public void doSomething() {
    //...
    count++;  // Noncompliant
  }
}
</pre>', null, null, 'bug,multi-threading', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000033, '20180228212013', 'panjy3', 'code', 'sso', 'code/sso/src/com/asiainfo/portal/framework/external/PortalFirstFilter.java', 441, 'CRITICAL', 'Throwable.printStackTrace(...) should not be called', 'Use a logger to log this exception.', '<p><code>Throwable.printStackTrace(...)</code> prints a throwable and its stack trace to some stream.</p>
<p>Loggers should be used instead to print throwables, as they have many advantages:</p>
<ul>
<li> Users are able to easily retrieve the logs.
</li><li> The format of log messages is uniform and allow users to browse the logs easily.
</li></ul>

<h2>Noncompliant Code Example</h2>
<pre>
try {
  /* ... */
} catch(Exception e) {
  e.printStackTrace();        // Noncompliant
}
</pre>

<h2>Compliant Solution</h2>
<pre>
try {
  /* ... */
} catch(Exception e) {
  LOGGER.log("context", e);
}
</pre>', null, null, 'error-handling,security', to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000034, '20180228212013', 'panjy3', 'code', 'sso', 'code/sso/src/com/asiainfo/portal/framework/external/PortalFirstFilter.java', 82, 'CRITICAL', 'Instance methods should not write to "static" fields', 'Make the enclosing method "static" or remove this set.', '<p>Correctly updating a <code>static</code> field from a non-static method is tricky to get right and could easily lead to bugs if there are multiple class instances  and/or multiple threads in play. Ideally, <code>static</code> fields are only updated from <code>synchronized static</code> methods.</p>
<p>This rule raises an issue each time a <code>static</code> field is updated from a non-static method.</p>

<h2>Noncompliant Code Example</h2>
<pre>
public class MyClass {

  private static int count = 0;

  public void doSomething() {
    //...
    count++;  // Noncompliant
  }
}
</pre>', null, null, 'bug,multi-threading', to_date('05-03-2018 10:18:35', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000035, '20180228212013', 'panjy3', 'code', 'sso', 'code/sso/src/com/asiainfo/portal/framework/external/PortalFirstFilter.java', 388, 'CRITICAL', 'Throwable.printStackTrace(...) should not be called', 'Use a logger to log this exception.', '<p><code>Throwable.printStackTrace(...)</code> prints a throwable and its stack trace to some stream.</p>
<p>Loggers should be used instead to print throwables, as they have many advantages:</p>
<ul>
<li> Users are able to easily retrieve the logs.
</li><li> The format of log messages is uniform and allow users to browse the logs easily.
</li></ul>

<h2>Noncompliant Code Example</h2>
<pre>
try {
  /* ... */
} catch(Exception e) {
  e.printStackTrace();        // Noncompliant
}
</pre>

<h2>Compliant Solution</h2>
<pre>
try {
  /* ... */
} catch(Exception e) {
  LOGGER.log("context", e);
}
</pre>', null, null, 'error-handling,security', to_date('05-03-2018 10:18:35', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000036, '20180228212013', 'panjy3', 'code', 'sso', 'code/sso/src/com/asiainfo/portal/framework/external/PortalFirstFilter.java', 104, 'CRITICAL', 'Instance methods should not write to "static" fields', 'Make the enclosing method "static" or remove this set.', '<p>Correctly updating a <code>static</code> field from a non-static method is tricky to get right and could easily lead to bugs if there are multiple class instances  and/or multiple threads in play. Ideally, <code>static</code> fields are only updated from <code>synchronized static</code> methods.</p>
<p>This rule raises an issue each time a <code>static</code> field is updated from a non-static method.</p>

<h2>Noncompliant Code Example</h2>
<pre>
public class MyClass {

  private static int count = 0;

  public void doSomething() {
    //...
    count++;  // Noncompliant
  }
}
</pre>', null, null, 'bug,multi-threading', to_date('05-03-2018 10:18:35', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.illegal_code_info (ILLEGAL_ID, CODE_TIME, DEVELOPER, PROJECT, MODULAR, CODE_URL, CODE_LINE, ILLEGAL_LEVEL, RULE_NAME, ILLEGAL_DESCRIPTION, REVISING_SUGGESTIONS1, REVISING_SUGGESTIONS2, REVISING_SUGGESTIONS3, ILLEGAL_LABEL, CREATE_TIME, BATCH_NUMBER, STATE, BUG_SERIAL)
values (10000037, '20180228212013', 'panjy3', 'code', 'sso', 'code/sso/src/com/asiainfo/portal/framework/external/PortalFirstFilter.java', 85, 'CRITICAL', 'Instance methods should not write to "static" fields', 'Make the enclosing method "static" or remove this set.', '<p>Correctly updating a <code>static</code> field from a non-static method is tricky to get right and could easily lead to bugs if there are multiple class instances  and/or multiple threads in play. Ideally, <code>static</code> fields are only updated from <code>synchronized static</code> methods.</p>
<p>This rule raises an issue each time a <code>static</code> field is updated from a non-static method.</p>

<h2>Noncompliant Code Example</h2>
<pre>
public class MyClass {

  private static int count = 0;

  public void doSomething() {
    //...
    count++;  // Noncompliant
  }
}
</pre>', null, null, 'bug,multi-threading', to_date('05-03-2018 10:18:35', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1, null);

insert into base.developer_illegal_info (DEVELOPER, BLOCKER, CRITICAL, MAJOR, MINOR, INFO, CREATE_DATE, BATCH_NUMBER, STATE)
values ('shibr', null, 1, null, null, null, to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1);

insert into base.developer_illegal_info (DEVELOPER, BLOCKER, CRITICAL, MAJOR, MINOR, INFO, CREATE_DATE, BATCH_NUMBER, STATE)
values ('saijirihu', null, 1, null, null, null, to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1);

insert into base.developer_illegal_info (DEVELOPER, BLOCKER, CRITICAL, MAJOR, MINOR, INFO, CREATE_DATE, BATCH_NUMBER, STATE)
values ('huzq', null, 5, null, null, null, to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1);

insert into base.developer_illegal_info (DEVELOPER, BLOCKER, CRITICAL, MAJOR, MINOR, INFO, CREATE_DATE, BATCH_NUMBER, STATE)
values ('wangzhanfeng', null, 8, null, null, null, to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1);

insert into base.developer_illegal_info (DEVELOPER, BLOCKER, CRITICAL, MAJOR, MINOR, INFO, CREATE_DATE, BATCH_NUMBER, STATE)
values ('luyang', null, 1, null, null, null, to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1);

insert into base.developer_illegal_info (DEVELOPER, BLOCKER, CRITICAL, MAJOR, MINOR, INFO, CREATE_DATE, BATCH_NUMBER, STATE)
values ('panjy3', null, 20, null, null, null, to_date('05-03-2018 10:18:34', 'dd-mm-yyyy hh24:mi:ss'), 10000001, 1);

insert into base.sonar_employee (DEVELOPER, PASSWORD, SUPERIOR_LEADERSHIP, IMPORT_FLAG, STATE, SUPERADMINISTRATOR_FLAG)
values ('wanglei6', 'admin123', '-1', 'Y', 1, 'Y');

