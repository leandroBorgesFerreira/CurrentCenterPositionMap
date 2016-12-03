[ ![Download](https://api.bintray.com/packages/lehen01/maven/MapWrapperChoosePlace/images/download.svg) ](https://bintray.com/lehen01/maven/MapWrapperChoosePlace/_latestVersion)

## CurrentCenterPosition
This is a wrapper for an animation of a position selection pin. Just include de MapFragment inside the xml and it will do the rest. =]

![enter image description here](https://lh3.googleusercontent.com/-Nuh7cj-9bts/WENMftCdwrI/AAAAAAAAK2s/Ru_uLP2Jf9o8anZT3zDiaE3bxVXROrGYQCLcB/s400/mapcenger.gif "mapcenger.gif")
##Usage

     <br.com.simplepass.mapfragmentwrapper.MapFragmentWrapper
        android:id="@+id/map_wrapper"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <fragment
            android:id="@+id/main_fragment_map"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            class="com.google.android.gms.maps.SupportMapFragment"/>

    </br.com.simplepass.mapfragmentwrapper.MapFragmentWrapper>

That's it! Easy right?

##Install

    compile 'br.com.simplepass:mapfragmentwrapper:0.8.0'
    
## Bugs and Feedback
For bugs, feature requests, and discussion please use [GitHub Issues](https://github.com/leandroBorgesFerreira/CurrentCenterPositionMap/issues).

##License

The MIT License (MIT)

Copyright (c) 2016 Leandro Ferreira

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
