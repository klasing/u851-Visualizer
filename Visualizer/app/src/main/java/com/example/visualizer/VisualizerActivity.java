package com.example.visualizer;
/*
 * File -> Settings
 * Editor -> File and Code templates
 * select Class from list
 * enter following text in right window
 * #if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end #parse("File Header.java") public class ${NAME} { }
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class VisualizerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizer);
    }
}
