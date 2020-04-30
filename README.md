# Gradient-Color-Animation-Android
### Easily animate your app background color
## screenshots

<p float="center">
  <img src="https://user-images.githubusercontent.com/15949588/65055263-bf3f5080-d966-11e9-881c-8ea20f33bb2c.png" width="200" />
  <img src="https://user-images.githubusercontent.com/15949588/65055266-bfd7e700-d966-11e9-934e-07557c7279b8.png" width="200" /> 
</p>

# Usage
Create seperates drawable color file and add to your `drawable folder` example: color1 copy and past below code for each
```xml

<--color1-->

<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android">
  <gradient android:startColor="#FF4081"
             android:endColor="#0f3443"
             android:angle="90" />
</shape>
  
  <--color2-->
    
 <?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android">
    <gradient
        android:startColor="#ffffff"
        android:endColor="#191654"
        android:angle="135"/>
</shape>
    
     <--and so on-->
  
```

Create a drawable color file and add to your `drawable folder` example: animation_colors.xml copy below file and past below code

```xml
  <item  android:drawable="@drawable/color1"
           android:duration="9000"/>


    <item  android:drawable="@drawable/color2"
        android:duration="9000"/>
```


 In your activity `MainActivity.java`
```java
new BackgroundColorAnimation().
                init(layout).// your activity xml
                setEnterAnimDuration(500).// long
                setExitAnimDuration(200).// long
                start();
```
 Overide some life circle methods 
```java
   @Override
    protected void onPause() {
        super.onPause();
        new BackgroundColorAnimation().stop();
    }

    @Override
    protected void onResume() {
        super.onResume();
        new BackgroundColorAnimation().start();
    }
}
```


# Installation(GRADLE)
Add in your `build.gradle` project level file
```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	    }
	}
```

Add in your `build.gradle` app level file
```gradle
dependencies {
 	   implementation 'com.github.Inihood1:Gradient-Color-Animation-Android:1.0.1'
}
```

# Licence
Copyright 2020 Ini Hood

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


