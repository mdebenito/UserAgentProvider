# UserAgentProvider
Random User Agent string provider for Java.

## Maven dependency:

```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```
```xml
<dependency>
    <groupId>com.github.mdebenito</groupId>
    <artifactId>UserAgentProvider</artifactId>
    <version>master-SNAPSHOT</version>
</dependency>
```

## Javadoc

<h3>Constructor Summary</h3>
<table class="memberSummary" border="0" cellpadding="3" cellspacing="0" summary="Constructor Summary table, listing constructors, and an explanation">
<tr>
<th class="colOne" scope="col">Constructor and Description</th>
</tr>
<tr class="altColor">
<td class="colOne"><code><span class="memberNameLink"><a href="../loader/UserAgentStringLoader.html#UserAgentStringLoader--">UserAgentStringLoader</a></span>()</code>
<div class="block">Default constructor, initializes the list and loads the strings into it from the configuration file.</div>
</td>
</tr>
</table>

<h3>Method Summary</h3>
<table class="memberSummary" border="0" cellpadding="3" cellspacing="0" summary="Method Summary table, listing methods, and an explanation">
<tr>
<th class="colFirst" scope="col">Modifier and Type</th>
<th class="colLast" scope="col">Method and Description</th>
</tr>
<tr id="i0" class="altColor">
<td class="colFirst"><code>java.lang.String</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../loader/UserAgentStringLoader.html#getRandomUserAgentString--">getRandomUserAgentString</a></span>()</code>
<div class="block">Randomly selects one of the configured User Agent strings and returns it.</div>
</td>
</tr>
<tr id="i1" class="rowColor">
<td class="colFirst"><code>java.util.List&lt;java.lang.String&gt;</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../loader/UserAgentStringLoader.html#getUserAgentStrings--">getUserAgentStrings</a></span>()</code>
<div class="block">Returns the current list of User Agent strings.</div>
</td>
</tr>
</table>

<h3>Constructor Detail</h3>
<ul class="blockListLast">
<li class="blockList">
<h4>UserAgentStringLoader</h4>
<pre>public&nbsp;UserAgentStringLoader()
                      throws java.io.FileNotFoundException</pre>
<div class="block">Default constructor, initializes the list and loads the strings into it from the configuration file.</div>
<dl>
<dt><span class="throwsLabel">Throws:</span></dt>
<dd><code>java.io.FileNotFoundException</code></dd>
</dl>
</li>
</ul>
</li>
</ul>
</div>

<h3>Method Detail</h3>
<a name="getUserAgentStrings--">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>getUserAgentStrings</h4>
<pre>public&nbsp;java.util.List&lt;java.lang.String&gt;&nbsp;getUserAgentStrings()</pre>
<div class="block">Returns the current list of User Agent strings.</div>
<dl>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>a List object that contains all the User Agent Strings configured.</dd>
</dl>
</li>
</ul>
<a name="getRandomUserAgentString--">
<!--   -->
</a>
<ul class="blockListLast">
<li class="blockList">
<h4>getRandomUserAgentString</h4>
<pre>public&nbsp;java.lang.String&nbsp;getRandomUserAgentString()</pre>
<div class="block">Randomly selects one of the configured User Agent strings and returns it.</div>
<dl>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>A random User Agent string.</dd>
</dl>
</li>
</ul>
</li>
</ul>
</li>
</ul>
</div>