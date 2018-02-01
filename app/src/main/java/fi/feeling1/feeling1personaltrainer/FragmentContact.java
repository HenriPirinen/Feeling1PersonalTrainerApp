package fi.feeling1.feeling1personaltrainer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by it15 on 30.1.2018.
 */

public class FragmentContact extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_contact, null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.callButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent out = new Intent();
                out.setAction(Intent.ACTION_DIAL);
                out.setData(Uri.parse("tel:" + Uri.encode("+358504070803")));
                startActivity(out);

            }
        });

        view.findViewById(R.id.smsButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number = "+358504070803";  // The number on which you want to send SMS
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", number, null)));

            }
        });

        view.findViewById(R.id.emailButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent email = new Intent(Intent.ACTION_SEND);
                //email.putExtra(Intent.EXTRA_EMAIL, new String[]{"youremail@yahoo.com"});
                //email.putExtra(Intent.EXTRA_SUBJECT, "subject");
                //email.putExtra(Intent.EXTRA_TEXT, "message");
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Choose an Email client :"));

            }
        });


    }
}
