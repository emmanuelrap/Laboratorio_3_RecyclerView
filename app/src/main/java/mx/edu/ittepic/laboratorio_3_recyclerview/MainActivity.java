package mx.edu.ittepic.laboratorio_3_recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] nombres={"ARANDA PATRON NOMAR JAZIEL",
            "CARDENAS RAMOS FRANCISCO EMANUEL",
            "CASTILLO CORRALES VICTOR EMMANUEL",
            "CERVANTES JIMÉNEZ JOSÉ MIGUEL",
            "CORDERO RIVERA SELVA YAZMIN",
            "CORDERO VILLA OSCAR ALBERTO",
            "ESPINOSA ABANDO DENISSE YANETH",
            "FIGUEROA CUETO JUAN RAMON",
            "GALLEGOS GODINEZ FRANCISCO JAVIER",
            "GIL LLANOS JUAN PEDRO",
            "GONZALEZ ARELLANO ERNESTO",
            "GUTIERREZ ESPARZA BRAYAN JESUS",
            "GUTIÉRREZ ROJAS BRYAN",
            "LOPEZ ALVARADO MISSAEL",
            "MARTINEZ BAÑUELOS ERIKA LIZBETH",
            "MENDEZ SANTANA KEVIN ALEJANDRO",
            "MONROY SALCEDO JOSE DE JESUS",
            "PADILLA SIMÓN BRIAN EFRÉN",
            "PARRA DOMINGUEZ DYLAN SALVADOR",
            "PEREZ ARAIZA FLOR MARIELA",
            "PUGA FLORES CARLOS",
            "REYES GODINEZ CARLA GUADALUPE",
            "REYES GUERRERO GUILLERMO GUADALUPE",
            "RICO ESPARZA HENRY",
            "RIVERA RAMIREZ DAVID",
            "SANCHEZ CARRILLO BETSY DEL CARMEN",
            "SILVA CAMACHO EDUARDO LUIS",
            "TORRES CUETO JESUS MANUEL",
            "VALDEZ LOPEZ HOLLIVER EDUARDO",
            "VALENZUELA MIRAMONTES JOSE PABLO",
            "ZAMORANO ALCALÁ GUILLERMO"};

    String [] carreras={"Sistemas",
            "Sistemas",
            "Quimica",
            "Sistemas",
            "Tics",
            "Sistemas",
            "Quimica",
            "Sistemas",
            "Tics",
            "Sistemas",
            "Quimica",
            "Sistemas",
            "Tics",
            "Sistemas",
            "Quimica",
            "Sistemas",
            "Tics",
            "Sistemas",
            "Quimica",
            "Sistemas",
            "Tics",
            "Sistemas",
            "Quimica",
            "Sistemas",
            "Tics",
            "Sistemas",
            "Quimica",
            "Sistemas",
            "Tics",
            "Tics",
            "Sistemas"};

    String [] matriculas={"15408517",
            "14401587",
            "13405888",
            "12405889",
            "14401587",
            "13405888",
            "12405889",
            "14401587",
            "13405888",
            "12405889",
            "14401587",
            "13405888",
            "12405889",
            "14401587",
            "13405888",
            "12405889",
            "14401587",
            "13405888",
            "12405889",
            "12405889",
            "14401587",
            "13405888",
            "14401058",
            "12405889",
            "14401587",
            "13405888",
            "125889",
            "14401587",
            "13405888",
            "12405889",
            "18558477"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Crear referencias hacia el componente RecycleriView
        recyclerView = findViewById(R.id.recycler_id);

        // Crear un objeto de tipo RecyclerAdapter que areglos de cadenas
        adapter = new RecyclerAdapter(nombres,carreras,matriculas);

        // Crea un objeto de tipo LinearLayoutManager
        layoutManager = new LinearLayoutManager(this);

        // Establecer el LayautManager
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        // Establecer el Adapter
        recyclerView.setAdapter(adapter);

    }
}
