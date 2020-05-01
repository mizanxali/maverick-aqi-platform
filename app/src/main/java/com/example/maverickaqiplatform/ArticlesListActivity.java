package com.example.maverickaqiplatform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ArticlesListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles_list);

        ListView articlesListView = (ListView)findViewById(R.id.articlesListView);
        ArrayList<String>  articleTitles = new ArrayList<String>();
        final ArrayList<String> articleUrls = new ArrayList<String>();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, articleTitles);
        articleTitles.add("Coronavirus impact: Smog clear, Indians breathe easier as nation-wide lockdowns kick in");
        articleUrls.add("https://economictimes.indiatimes.com/magazines/panache/coronavirus-impact-smog-clear-indians-breathe-easier-as-nation-wide-lockdowns-kick-in/articleshow/74792885.cms?from=mdr");
        articleTitles.add("'It's positively alpine!': Disbelief in big cities as air pollution falls");
        articleUrls.add("https://www.theguardian.com/environment/2020/apr/11/positively-alpine-disbelief-air-pollution-falls-lockdown-coronavirus");
        articleTitles.add("Coronavirus Impact | Air quality improves in India, finally");
        articleUrls.add("https://www.moneycontrol.com/news/economy/policy/coronavirus-impact-air-quality-improves-in-india-but-will-it-prevent-climate-change-5067011.html");
        articleTitles.add("Air quality is way better in nine major cities after coronavirus confinement");
        articleUrls.add("https://www.theverge.com/2020/4/22/21230917/air-quality-pollution-coronavirus-lockdown-social-distancing-cities");
        articleTitles.add("India Savors a Rare Upside to Coronavirus: Clean Air");
        articleUrls.add("https://www.nytimes.com/2020/04/08/world/asia/india-pollution-coronavirus.html");
        articleTitles.add("A breath of fresh air : How air quality has improved during the coronavirus crisis");
        articleUrls.add("https://graphics.reuters.com/CLIMATE-CHANGE/CORONAVIRUS-POLLUTION/jznvngjyplm/index.html");
        articleTitles.add("Coronavirus lockdown lifts Delhi’s March air quality to 5-year high");
        articleUrls.add("https://www.thehindu.com/news/cities/Delhi/coronavirus-lockdown-lifts-delhis-march-air-quality-to-5-year-high/article31252221.ece");
        articleTitles.add("An Analysis of the Impact of the CoronaVirus Lockdown on our Environment.");
        articleUrls.add("https://towardsdatascience.com/assessing-the-impact-of-the-coronavirus-lockdown-on-our-environment-through-data-2905535da51e");
        articleTitles.add("These pictures show how China's air pollution has dropped during the coronavirus outbreak");
        articleUrls.add("https://www.weforum.org/agenda/2020/03/chinas-pollution-coronavirus-lockdown-covid19-enviroment");
        articleTitles.add("The world's largest coronavirus lockdown is having a dramatic impact on pollution in India");
        articleUrls.add("https://edition.cnn.com/2020/03/31/asia/coronavirus-lockdown-impact-pollution-india-intl-hnk/index.html");
        articleTitles.add("Coronavirus Lockdown Brings Down Pollution Levels Across India; Delhi Air ‘Satisfactory’");
        articleUrls.add("https://weather.com/en-IN/india/pollution/news/2020-03-23-coronavirus-lockdown-weather-improve-delhi-air-satisfactory");
        articleTitles.add("World’s Dirtiest Air Gets Cleaner After India’s Lockdown");
        articleUrls.add("https://www.bloomberg.com/news/articles/2020-04-07/world-s-dirtiest-air-gets-cleaner-after-india-s-lockdown");
        articleTitles.add("Air pollution goes down as Europe takes hard measures to combat coronavirus");
        articleUrls.add("https://www.eea.europa.eu/highlights/air-pollution-goes-down-as");
        articleTitles.add("Coronavirus: Pollution levels fall 'dramatically'");
        articleUrls.add("https://www.bbc.com/news/uk-england-london-52114306");
        articleTitles.add("Global Air Pollution Has Fallen Due to the Coronavirus Outbreak, but Experts Warn It Isn't a Silver Lining");
        articleUrls.add("https://time.com/5812741/air-pollution-coronavirus/");

        articlesListView.setAdapter(arrayAdapter);

        articlesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), ArticleActivity.class);
                intent.putExtra("url", articleUrls.get(position));
                startActivity(intent);
            }
        });
    }
}
