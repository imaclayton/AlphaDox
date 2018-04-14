package e.immanuelclayton.alphadox;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class IctFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ict, container, false);
        Button butt2 = (Button)view.findViewById(R.id.button2);
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.ict,new MediaFragment());
                fr.addToBackStack(String.valueOf(R.id.ict));
                fr.commit();
            }
        });
        return view;
    }
}
