package com.example.navigationdrawerdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class CatalogueFragment extends Fragment {

    // Données du catalogue
    private final String[] emojis    = {"🚀","🎨","🔧","📱","🌐","🎯","💡","🔒","📊","🎮"};
    private final String[] titres    = {"Lancer projet","Design UI","Maintenance",
            "Mobile App","Web Service","Objectifs",
            "Innovation","Sécurité","Analytics","Gaming"};
    private final String[] subtitles = {"En production","En cours","Planifié",
            "Beta","Actif","Q4 2024",
            "R&D","Critique","Dashboard","v2.0"};
    private final String[] badges    = {"LIVE","WIP","SOON","BETA","ON",
            "Q4","NEW","HIGH","PRO","v2"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_catalogue_root, container, false);
        LinearLayout list = root.findViewById(R.id.catalogue_list);

        for (int i = 0; i < titres.length; i++) {
            View item = inflater.inflate(R.layout.item_catalogue, list, false);

            ((TextView) item.findViewById(R.id.item_emoji)).setText(emojis[i]);
            ((TextView) item.findViewById(R.id.item_title)).setText(titres[i]);
            ((TextView) item.findViewById(R.id.item_subtitle)).setText(subtitles[i]);
            ((TextView) item.findViewById(R.id.item_badge)).setText(badges[i]);

            list.addView(item);
        }
        return root;
    }
}