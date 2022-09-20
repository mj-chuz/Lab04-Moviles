package cr.ac.ucr.ecci.fragmentexample;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public class Fragment4 extends Fragment {
    private final String ARG_PARAM1 = "nameParam";
    private TextView fragment4Text;
    private String mensajeFragment1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        Bundle bundle = new Bundle();
        bundle = getArguments();
        super.onCreate(savedInstanceState);
        if (bundle != null){
            mensajeFragment1 = bundle.getString("mensaje");
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inf = inflater.inflate(R.layout.fragment_4, container, false);
        fragment4Text = (TextView) inf.findViewById(R.id.titleFragment4);
        fragment4Text.setText(mensajeFragment1);
        return inf;
    }
}
