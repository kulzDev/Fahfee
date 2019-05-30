package com.example.fah_fee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.fah_fee.adapter.NumberRecyclerAdapter;
import com.example.fah_fee.model.PlayNumber;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView number_rv;
    private NumberRecyclerAdapter numberList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //numberList = new NumberRecyclerAdapter(this, getNumbers());
        numberList = new NumberRecyclerAdapter(this, getNumbers());

        number_rv = (RecyclerView) findViewById(R.id.number_rv);
        number_rv.setLayoutManager(new GridLayoutManager(this, 4));
        number_rv.setItemAnimator(new DefaultItemAnimator());
        number_rv.setAdapter(numberList);
    }

    private ArrayList<PlayNumber> getNumbers() {
        ArrayList<PlayNumber> numbers = new ArrayList<>();
        PlayNumber num = new PlayNumber(R.drawable.king, "1. King");
        numbers.add(num);
        num = new PlayNumber(R.drawable.moneymoney, "2. Money");
        numbers.add(num);
        num = new PlayNumber(R.drawable.big_water, "3. Big water");
        numbers.add(num);
        num = new PlayNumber(R.drawable.dead_man, "4. Dead man");
        numbers.add(num);
        num = new PlayNumber(R.drawable.tiger, "5. Tiger");
        numbers.add(num);
        num = new PlayNumber(R.drawable.cow, "6. Cow");
        numbers.add(num);
        num = new PlayNumber(R.drawable.con_man, "7. Con man");
        numbers.add(num);
        num = new PlayNumber(R.drawable.pig, "8. Pig");
        numbers.add(num);
        num = new PlayNumber(R.drawable.moon, "9. Moon");
        numbers.add(num);
        num = new PlayNumber(R.drawable.eggs, "10. Eggs");
        numbers.add(num);
        num = new PlayNumber(R.drawable.car, "11. Car");
        numbers.add(num);
        num = new PlayNumber(R.drawable.dead__woman, "12. Dead woman");
        numbers.add(num);
        num = new PlayNumber(R.drawable.big_fish, "13. Big fish");
        numbers.add(num);
        num = new PlayNumber(R.drawable.old_woman, "14. Old woman");
        numbers.add(num);
        num = new PlayNumber(R.drawable.prostitute, "15. Magosha");
        numbers.add(num);
        num = new PlayNumber(R.drawable.pigeon, "16. Pigeons");
        numbers.add(num);
        num = new PlayNumber(R.drawable.white_woman, "17. White woman ");
        numbers.add(num);
        num = new PlayNumber(R.drawable.small_change, "18.Small change");
        numbers.add(num);
        num = new PlayNumber(R.drawable.young_girls, "19. Young girls");
        numbers.add(num);
        num = new PlayNumber(R.drawable.cat, "20. Cat");
        numbers.add(num);
        num = new PlayNumber(R.drawable.elephant, "21. Elephant");
        numbers.add(num);
        num = new PlayNumber(R.drawable.ship, "22. Ship");
        numbers.add(num);
        num = new PlayNumber(R.drawable.tan_horse, "23. Horse");
        numbers.add(num);
        num = new PlayNumber(R.drawable.mouth, "24. Mouth");
        numbers.add(num);
        num = new PlayNumber(R.drawable.big_house, "25. Big house");
        numbers.add(num);
        num = new PlayNumber(R.drawable.bees, "26. Bees");
        numbers.add(num);
        num = new PlayNumber(R.drawable.dog, "27. Dog");
        numbers.add(num);
        num = new PlayNumber(R.drawable.smallfish, "28. Small fish");
        numbers.add(num);
        num = new PlayNumber(R.drawable.little_water, "29. Little water");
        numbers.add(num);
        num = new PlayNumber(R.drawable.priest, "30. Priest");
        numbers.add(num);
        num = new PlayNumber(R.drawable.fire, "31. Fire");
        numbers.add(num);
        num = new PlayNumber(R.drawable.big_change, "32. Big change");
        numbers.add(num);
        num = new PlayNumber(R.drawable.small_boys, "33. Young boys");
        numbers.add(num);
        num = new PlayNumber(R.drawable.shit, "34. Shit");
        numbers.add(num);
        num = new PlayNumber(R.drawable.nonkroi, "35. Nonkroi");
        numbers.add(num);
        num = new PlayNumber(R.drawable.eggplant, "36. Penis");
        numbers.add(num);
        return numbers;
    }
}
