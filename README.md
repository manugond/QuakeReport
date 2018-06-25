Quake Report App
===================================

This app displays a list of recent earthquakes in the world
from the U.S. Geological Survey (USGS) organization.

Used in a Udacity course in the Beginning Android Nanodegree.

More info on the USGS Earthquake API available at:
https://earthquake.usgs.gov/fdsnws/event/1/

##
About Gradle
=================================
Latest update of Android Studio made use of "compile" invalid in gradle build, it has been replaced by "implement", if you are forking this respo, and still find error with gradle sync, then create a new project with min supported API of Android Lollipop and copy the gradle script of that app into this one(It will solve the problem).


##
ToDo
==========================
* [ ] Update the app with spinner to select the earthquakes based on month, week, or year.
* [ ] Add support of searching of location 
* [ ] Merge features of DidYouFeelIt app, so user can look at number of audience that felt the earthquake



##
ScreenShot
=====================================
Screenshot in a xxhdpi Android Phone

![alt text](https://github.com/manugond/ud843-QuakeReport/blob/starting-point/Screenshot1.png)

Pre-requisites
--------------

- Android SDK v27
- Android Build Tools v27.0.1
- Android Support Repository v27.0.1

Getting Started
---------------

This sample uses the Gradle build system. To build this project, use the
"gradlew build" command or use "Import Project" in Android Studio.


License
-------

Copyright 2016 The Android Open Source Project, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
