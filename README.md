# Toast Silicon
[![](https://jitpack.io/v/rupomsoft/Toast-Silicon.svg)](https://jitpack.io/#rupomsoft/Toast-Silicon)

# Preview
![Preview Image](https://github.com/rupomsoft/Toast-Silicon/blob/master/preview.png)

# Demo APK 
[Toast Silicon Demo App](https://github.com/rupomsoft/Toast-Silicon/blob/master/Toast%20Silicon%20Demo.apk?raw=true)

# Installation 

1. Add maven in your build.gradle(project) file inside allprojects 

		allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		   }
		}

2. Implement in your build.gradle(Module:app) file.

		dependencies {
	        	implementation 'com.github.rupomsoft:Toast-Silicon:1.0.0'
		}



# Example 
        ToastSilicon.toastPrimaryOne(MainActivity.this,"This is toast primary",Toast.LENGTH_SHORT);
	
	ToastSilicon.toastDangerOne(MainActivity.this,"This is toast danger",Toast.LENGTH_SHORT);
	
	ToastSilicon.toastWarningOne(MainActivity.this,"This is toast warning",Toast.LENGTH_SHORT);
	
	ToastSilicon.toastInfoOne(MainActivity.this,"This is toast info",Toast.LENGTH_SHORT);
	
        ToastSilicon.toastSuccessOne(MainActivity.this,"This is toast success",Toast.LENGTH_SHORT);
	
        ToastSilicon.toastPrimaryTwo(MainActivity.this,"This is toast primary",Toast.LENGTH_SHORT);
	
        ToastSilicon.toastDangerTwo(MainActivity.this,"This is toast danger",Toast.LENGTH_SHORT);
	
        ToastSilicon.toastWarningTwo(MainActivity.this,"This is toast warning",Toast.LENGTH_SHORT);
	
        ToastSilicon.toastInfoTwo(MainActivity.this,"This is toast info",Toast.LENGTH_SHORT);
	
        ToastSilicon.toastSuccessTwo(MainActivity.this,"This is toast success",Toast.LENGTH_SHORT);
	
        ToastSilicon.toastPrimaryThree(MainActivity.this,"Primary","This is toast primary",Toast.LENGTH_SHORT);
	
        ToastSilicon.toastDangerThree(MainActivity.this,"Danger","This is toast danger",Toast.LENGTH_SHORT);
	
        ToastSilicon.toastWarningThree(MainActivity.this,"Warning","This is toast warning",Toast.LENGTH_SHORT);
	
        ToastSilicon.toastInfoThree(MainActivity.this,"Info","This is toast info",Toast.LENGTH_SHORT);
	
        ToastSilicon.toastSuccessThree(MainActivity.this,"Success","This is toast success",Toast.LENGTH_SHORT);
	
        ToastSilicon.toastPrimaryFour(MainActivity.this,"This is toast primary",Toast.LENGTH_SHORT);
	
        ToastSilicon.toastDangerFour(MainActivity.this,"This is toast danger",Toast.LENGTH_SHORT);
	
        ToastSilicon.toastWarningFour(MainActivity.this,"This is toast warning",Toast.LENGTH_SHORT);
	
        ToastSilicon.toastInfoFour(MainActivity.this,"This is toast info",Toast.LENGTH_SHORT);
	
        ToastSilicon.toastSuccessFour(MainActivity.this,"This is toast success",Toast.LENGTH_SHORT);
	
	

# Licensing
Copyright 2019-2020 Rabbil Hasan

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
   
