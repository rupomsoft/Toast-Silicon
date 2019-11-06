package com.rabbil.toastsiliconlibrary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ToastSilicon {

    public  static void toastPrimaryOne(Context context, String toastMessage, int duration){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.toast_one_primary_layout,null);
        TextView textView=layout.findViewById(R.id.toast_one_primary_text);
        textView.setText(toastMessage);
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }
    public static void toastDangerOne(Context context,String toastMessage,int duration){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.toast_one_danger_layout,null);
        TextView textView=layout.findViewById(R.id.toast_one_danger_text);
        textView.setText(toastMessage);
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }
    public static  void toastWarningOne(Context context,String toastMessage,int duration){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.toast_one_warning_layout,null);
        TextView textView=layout.findViewById(R.id.toast_one_warning_text);
        textView.setText(toastMessage);
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }
    public static void toastInfoOne(Context context,String toastMessage,int duration){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.toast_one_info_layout,null);
        TextView textView=layout.findViewById(R.id.toast_one_info_text);
        textView.setText(toastMessage);
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }
    public static void toastSuccessOne(Context context,String toastMessage,int duration){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.toast_one_success_layout,null);
        TextView textView=layout.findViewById(R.id.toast_one_success_text);
        textView.setText(toastMessage);
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }


    public  static void toastPrimaryTwo(Context context, String toastMessage, int duration){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.toast_two_primary_layout,null);
        TextView textView=layout.findViewById(R.id.toast_two_primary_text);
        textView.setText(toastMessage);
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }
    public static void toastDangerTwo(Context context,String toastMessage,int duration){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.toast_two_danger_layout,null);
        TextView textView=layout.findViewById(R.id.toast_two_danger_text);
        textView.setText(toastMessage);
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }
    public static  void toastWarningTwo(Context context,String toastMessage,int duration){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.toast_two_warning_layout,null);
        TextView textView=layout.findViewById(R.id.toast_two_warning_text);
        textView.setText(toastMessage);
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }
    public static void toastInfoTwo(Context context,String toastMessage,int duration){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.toast_two_info_layout,null);
        TextView textView=layout.findViewById(R.id.toast_two_info_text);
        textView.setText(toastMessage);
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }
    public static void toastSuccessTwo(Context context,String toastMessage,int duration){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.toast_two_success_layout,null);
        TextView textView=layout.findViewById(R.id.toast_two_success_text);
        textView.setText(toastMessage);
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }

    public  static void toastPrimaryThree(Context context, String toastHeadline,String toastDescription, int duration){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.toast_three_primary_layout,null);
        TextView textView1=layout.findViewById(R.id.toast_three_primary_text1);
        TextView textView2=layout.findViewById(R.id.toast_three_primary_text2);
        textView1.setText(toastHeadline);
        textView2.setText(toastDescription);
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }
    public static void toastDangerThree(Context context, String toastHeadline,String toastDescription, int duration){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.toast_three_danger_layout,null);
        TextView textView1=layout.findViewById(R.id.toast_three_danger_text1);
        TextView textView2=layout.findViewById(R.id.toast_three_danger_text2);
        textView1.setText(toastHeadline);
        textView2.setText(toastDescription);
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }
    public static  void toastWarningThree(Context context, String toastHeadline,String toastDescription, int duration){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.toast_three_warning_layout,null);
        TextView textView1=layout.findViewById(R.id.toast_three_warning_text1);
        TextView textView2=layout.findViewById(R.id.toast_three_warning_text2);
        textView1.setText(toastHeadline);
        textView2.setText(toastDescription);
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }
    public static void toastInfoThree(Context context, String toastHeadline,String toastDescription, int duration){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.toast_three_info_layout,null);
        TextView textView1=layout.findViewById(R.id.toast_three_info_text1);
        TextView textView2=layout.findViewById(R.id.toast_three_info_text2);
        textView1.setText(toastHeadline);
        textView2.setText(toastDescription);
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }
    public static void toastSuccessThree(Context context, String toastHeadline,String toastDescription, int duration){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.toast_three_success_layout,null);
        TextView textView1=layout.findViewById(R.id.toast_three_success_text1);
        TextView textView2=layout.findViewById(R.id.toast_three_success_text2);
        textView1.setText(toastHeadline);
        textView2.setText(toastDescription);
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }

    public  static void toastPrimaryFour(Context context, String toastMessage, int duration){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.toast_four_primary_layout,null);
        TextView textView=layout.findViewById(R.id.toast_four_primary_text);
        textView.setText(toastMessage);
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }
    public static void toastDangerFour(Context context,String toastMessage,int duration){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.toast_four_danger_layout,null);
        TextView textView=layout.findViewById(R.id.toast_four_danger_text);
        textView.setText(toastMessage);
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }
    public static  void toastWarningFour(Context context,String toastMessage,int duration){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.toast_four_warning_layout,null);
        TextView textView=layout.findViewById(R.id.toast_four_warning_text);
        textView.setText(toastMessage);
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }
    public static void toastInfoFour(Context context,String toastMessage,int duration){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.toast_four_info_layout,null);
        TextView textView=layout.findViewById(R.id.toast_four_info_text);
        textView.setText(toastMessage);
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }
    public static void toastSuccessFour(Context context,String toastMessage,int duration){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.toast_four_success_layout,null);
        TextView textView=layout.findViewById(R.id.toast_four_success_text);
        textView.setText(toastMessage);
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }

}
