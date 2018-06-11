# Validation
This sample app with showing the way how to implement all vailation,editext,pincode...etc

#  Simple Demo

## Installing

We can install this library by using gradle

Step 1

```
allprojects {
    repositories {
	maven { url 'https://jitpack.io' }
     }
}
```

Step 2

```
dependencies {
   implementation 'com.github.SunryTeang:valiation:1.2'
}
```

## Simple using
### XML Code

```
   <com.teangsunry.validation.pincode.PinviewCode
        android:id="@+id/pinview"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:cursorVisible="false"
        app:forceKeyboard="true"
        app:hint="0"
        app:inputType="number"
        app:password="false"
        app:pinHeight="40dp"
        app:pinLength="4"
        app:pinTextColor="@android:color/black"
        app:pinTextColorHint="@color/colorPrimaryDark"
        app:pinTextSize="8sp"
        app:pinWidth="50dp" />

```
## Attributes
| Attribute | Use |
| ----------| --- |
| app:pinBackground | sets the background color for the pin view |
| app:inputType | sets the input type for pin view, can be `text` `password` `number` |
| app:pinTextColor | sets the text color of the edittext inside the pin view |
| app:pinTextColorHint | sets the hint text color of the edittext inside the pin view |
| app:password | true/false |
| app:hint | sets the hint text of the pincode |
| app:pinHeight | sets the height of the edittext inside pin view |
| app:pinWidth | sets the width of the edittext inside pin view |
| app:splitWidth | sets the width of the edittext outside pin view |
| app:pinLength | set number of edittext of pin view |
| app:pinTextSize | set edittext font size pin view |

## Listener get value from pincode
### Kotlin
```

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        init()

        pinview.setPinviewCodeEventListener { PinviewCode, fromUser -> println("${PinviewCode.value} , $fromUser") }
    }
    
}

```
### JAVA
```
public class MainActivityJava extends AppCompatActivity implements PinviewCode.PinviewCodeEventListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        PinviewCode mPinCodeView = (PinviewCode) findViewById(R.id.pinview);
        mPinCodeView.setPinviewCodeEventListener(this);
    }

    @Override
    public void onDataEntered(PinviewCode PinviewCode, boolean fromUser) {
        Log.i("Pincode:", "" + PinviewCode.getValue());
    }
}

```

## Min SDK Version

```
Support Min Sdk version >= 19

```

## Authors

* **Teang sunry** - [SunryTeang](https://github.com/SunryTeang)

See also the list of [contributors](https://github.com/SunryTeang/valiation/graphs/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](https://github.com/SunryTeang/valiation/blob/master/README.md) file for details
