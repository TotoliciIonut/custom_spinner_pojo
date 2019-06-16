package com.totoliciionut.mylibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomSpinnerPojo extends RelativeLayout {


    String title;
    ArrayList<Intstr_Pojo> values ;

    TextView titleView;
    TextView selectedTextView;
    View view;

    Boolean hasSelected=false;

    Boolean themeDark = false;

    Intstr_Pojo selected;

    public Intstr_Pojo getSelected() {
        return selected;
    }

    public Boolean getHasSelected() {
        return hasSelected;
    }

    boolean alreadyselected =false;
    CustomSpinnerOnItemClickListener customSpinnerOnItemClickListener;

    public CustomSpinnerPojo(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        view = LayoutInflater.from(context).inflate(R.layout.custom_spinner, this, true);

        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.CustomSpinnerPojo, 0, 0);

        try {
            title = a.getString(R.styleable.CustomSpinnerPojo_pick_text);
        } finally {
            a.recycle();
        }

        if (title == null) {
            title="";
        }
        title=title+"▼";
    }

    public void setTitle(String title) {
        this.title = title;
        titleView.setText(title);
        invalidate();

    }

    public void setCustomSpinnerOnItemClickListener(CustomSpinnerOnItemClickListener customSpinnerOnItemClickListener) {
        this.customSpinnerOnItemClickListener = customSpinnerOnItemClickListener;
    }

    public void selectValue(Intstr_Pojo value){

        for (Intstr_Pojo intstr_pojo: values){
            if (value.equals(intstr_pojo)){
                selected = intstr_pojo;
            }
        }
    }

    private void displayPopupWindow(View anchorView) {

        // create the popup window
        int width = this.getWidth()+100;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it

        ListView listView = new ListView(getContext());
        final PopupWindow popupWindow = new PopupWindow(listView, width, height, focusable);


        listView.setDivider(null);

        if(themeDark){
            listView.setBackground(getContext().getResources().getDrawable(R.drawable.drop_down_background_dark));
        }else listView.setBackground(getResources().getDrawable(R.drawable.drop_down_background));

        listView.setDividerHeight(0);
        listView.setAdapter(new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1,
                Intstr_Pojo.getAllIntStringPojoNamesString(values)));

        if (listView.getHeight()>750){
            LayoutParams params = new LayoutParams(listView.getLayoutParams());
            params.height=750;
            listView.setLayoutParams(params);
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                hasSelected=true;
                selected=  values.get(position);
                customSpinnerOnItemClickListener.customSpinnerOnItemClick(values.get(position).getAnInt());
                if (alreadyselected){
                    selectedTextView.setText(values.get(position).getString());
                }else {
                    UtilsAnim.moveViewDownWithAnimationAndMakeTextSmaller(titleView, 150,
                            4, 14, 10, new Runnable() {
                                @Override
                                public void run() {
                                    selectedTextView.setText(values.get(position).getString());
                                    selectedTextView.setVisibility(VISIBLE);
                                }
                            });



                    alreadyselected=true;

                }
                popupWindow.dismiss();
            }
        });


        popupWindow.showAsDropDown(anchorView, 0, 10);
    }

    public void setValues(final ArrayList<Intstr_Pojo> values,boolean themeDark) {
        this.values = values;
        this.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if (!alreadyselected){
                    displayPopupWindow(titleView);
                }else {
                displayPopupWindow(selectedTextView);
                }

            }
        });
        this.themeDark=themeDark;
    }

    public void setAllAtributes(String title,ArrayList values,boolean themeDark){
           setTitle(title);
           setValues(values,themeDark);
           this.themeDark=themeDark;
    }

    // Setup views
    private void init(String title,ArrayList values,boolean themeDark) {
        selectedTextView =findViewById(R.id.selected_text_view_custom_spinner);
        titleView = findViewById(R.id.text_view_custom_spinner);

        if (themeDark){
            titleView.setTextColor(getContext().getResources().getColor(R.color.colorWhite));
            selectedTextView.setTextColor(getContext().getResources().getColor(R.color.colorWhiteSecondary));
        }else {
            titleView.setTextColor(getContext().getResources().getColor(R.color.textColor));
            selectedTextView.setTextColor(getContext().getResources().getColor(R.color.colorGray));
        }

        titleView.setText(title);
        setValues(values,themeDark);

        invalidate();
    }
}

