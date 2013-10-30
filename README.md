# Game Closure DevKit Plugin: Heyzap

This plugin adds advertising support from the [Heyzap service](http://www.heyzap.com) for Android. Only the install attribution for advertising purposes is implemented at this time.

## Usage

Install the addon with `basil install heyzap`.

Include it in the `manifest.json` file under the "addons" section for your game:

~~~
"addons": [
	"heyzap"
],
~~~

Note that the key names are case-sensitive.

You can test for successful integration on the [Heyzap website](http://www.heyzap.com).