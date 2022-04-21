package sharma.gq.toasty;

import android.content.Context;
import android.widget.Toast;

public class Toasty {
    public static void showText(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
