slf4j-android-logger
==============

This library is based on the official slf4j-android implementation but with some differences.
It does not use the classname as the log tag but instead appends it after the message. It also appends the line number and current thread.
Configuration of the log tag is done through a properties file (`logger.properties`).

Configuration
-------------

Create a `logger.properties` file in resources and use the following directives to confgure.

### Available properties:

**Name:** `com.leppardlabs.slf4j.logTag`  
**Description:** The log tag to use when logging to Android's logger. Maximum 23 chars!

**Name:** `com.leppardlabs.slf4j.defaultLogLevel`  
**Values:** `TRACE`|`DEBUG`|`INFO`|`WARN`|`ERROR`

**Name:** `com.leppardlabs.slf4j.logToAndroidLogging`  
**Description:** Whether or not to log the Android Logging System. Default is true.

**Name:** `com.leppardlabs.slf4j.logToCrashlytics`  
**Description:** Whether or not to log to Crashlytics. Default is false.

**Name:** `com.leppardlabs.slf4j.logToLogEntries`  
**Description:** Whether or not to log to LogEntries.com. Default is false.


**Example**:
```properties
com.leppardlabs.slf4j.logToAndroidLogging=true
com.leppardlabs.slf4j.logToCrashlytics=false
com.leppardlabs.slf4j.logToLogEntries=false
com.leppardlabs.slf4j.logTag=MyAwesomeApp
com.leppardlabs.slf4j.defaultLogLevel=DEBUG
```

Gradle
--------

Gradle support is provided via [JitPack][3]

Per the JitPack documentation, first add the JitPack repository to your build file


Add it in your root build.gradle at the end of repositories:

```
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

Next, add the dependency

```
dependencies {
	compile 'com.github.bleppard:slf4j-android-logger:1.1.0'
}
```


Credits
-------

This library is based upon the official [slf4j-android][2] implementation, and is a branch off of Philip Schiffer's implementation.


License
-------

    Copyright 2013-2016 Philip Schiffer

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

[1]: http://repository.sonatype.org/service/local/artifact/maven/redirect?r=central-proxy&g=de.psdev&a=slf4j-android-logger&v=LATEST
[2]: https://github.com/qos-ch/slf4j/tree/master/slf4j-android
[3]: https://jitpack.io/#bleppard/slf4j-android-logger