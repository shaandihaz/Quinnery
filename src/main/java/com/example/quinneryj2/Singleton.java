package com.example.quinneryj2;

import java.util.ArrayList;

public class Singleton {
    private static Singleton mInstance;
    private ArrayList<Plant> list = null;

    public static Singleton getInstance() {
        if(mInstance == null)
            mInstance = new Singleton();

        return mInstance;
    }

    private Singleton() {
        list = new ArrayList<Plant>();
    }
    // retrieve array from anywhere
    public ArrayList<Plant> getArray() {
        return this.list;
    }

    //Add element to array
    public void addToArray(Plant value) {
        list.add(value);
    }

    Plant goutweed = new Plant("Goutweed", true, false, true, false, "Ground Cover", "goutweed", "Goutweed is famously difficult to remove. If you try to pull up the plant, you'll probably break the root system, which will actually release chemicals that cause the plant to reproduce! If possible, consult a professional, though it is possible to remove it yourself. If you aren't worried about killing other plants in the area, use an environmentally-friendly herbicide. In sunny regions, you can kill the goutweed by solarization - mow it down as low as possible, then cover the area with several tarps weighed down by rocks and leave it for at least a week. The sun will heat the area under the tarp and burn the goutweed. Source: gardeningchannel.com");
    Plant englishIvy = new Plant("English Ivy", true, true, true, false, "Ground Cover", "englishivy", "Wear gloves - english ivy can cause mild skin irritation. If the vine travels up a tree, cut it at about waist level and leave the upper vine to die off. Pull anything remaining below waist-level up from the base of the vine, making sure to entirely remove the root (use a shovel or trowel if it doesn't pull easily). Alternatively, frequently mow down the ivy until it dies, or spray it with an environmentally friendly herbicide. Source: hortmag.com");
    Plant japanesePachysandra = new Plant("Japanese Pachysandra", true, false,false,false, "Ground Cover", "jpachysandra", "Japanese pachysandra root systems are shallow - only about 4-6 inches deep - and you should be able to dig them up fairly easily.  In a sunny area, you can kill it pretty easily by solarization: mow it down as low as possible, then cover the area with several tarps weighed down by rocks and leave it for at least a week. The sun will heat the area under the tarp and burn the pachysandra. Source: gardeningknowhow.com" );
    Plant periwinkle = new Plant ("Periwinkle", true, true, true, true, "Ground Cover", "periwinkle","Because periwinkle is incredibly resilient, it will probably take several seasons of repeated removal to completely kill it off, but you must be resilient too! Manual removal is most effective - carefully rake the periwinkle to loosen its grip in the soil, then pull the periwinkle up from the base of the plant. Any root remaining underground will likely return next year as a new plant, so be careful. If you can't pull the whole plant up, cut it close to the base. Dispose of the pulled/cut stems carefully, probably in a plastic bag - if they come in contact with soil, they'll grow back quickly and aggressively. Avoid using herbicides, as their waxy leaves will wick off most liquids. Some ecologists have had luck with triclopyr amine mixed with mineral oil, if all else fails, though it will still probably take repeated applications to kill this invasive species. Source: ask.extension.org" );
    Plant garlicMustard = new Plant("Garlic Mustard", true,true,true,true, "abp", "garlicmustard", "Try to remove garlic mustard before May, as this is when the seeds form in the plants, and if you try to remove the plant after the seeds form, you'll probably just spread them and the garlic mustard will come back next season. As always, manual removal is best - grab the plant at the base and pull, aiming to remove the entire root. Even a pulled mustard plant will still go to seed, so bag the pulled plants to dispose of them. Some seed spreading is inevitable, so be sure to return to the area frequently to remove new growth or it'll all grow back! Source: emswcd.org");
    Plant japaneseStiltgrass = new Plant("Japanese Stiltgrass", true, true, true, false, "abp", "jstiltgrass", "If you have a small or manageable patch of Japanese stilt grass, hand pulling is a viable option. Physical removal can encourage seed from previous seasons to germinate and grow in the disturbed soil, so you need to be mindful of when you pull the grass. The best time is in the late summer when it is tall and easy to grab onto but before the grass has started to flower or has gone to seed. Fall is also a good time to hand-pull, because even if seeds in the soil germinate, they will be killed by frost before having a chance to produce seeds. Source: nybg.org");
    Plant honeysuckle = new Plant("Honeysuckle", true,true,true,true, "Bush", "honeysuckle", "Find the base of a cluster of honeysuckle. Cut the vines 2-3 inches off the ground. Pull the top part of the honeysuckle vines down and place it into a trash bag for disposal. This can take some work since the vines twist around other plants, but the vines may contain seeds that will disperse if you leave them. Apply a broadleaf herbicide containing at least 20 percent glyphosate to the entire outside of the remaining stump of each honeysuckle vine.  Source: ehow.com");
    Plant autumnOlive = new Plant("Autumn Olive", true,true,true,false, "Bush", "autumnolive", "Cut off the plant at the ground level. Then, apply an herbicide over the entire cut stump. This is effective in killing roots and preventing respreading. The herbicide should contain glyphosate, triclopyr and/or picloram. Roundup has proven an effective herbicide when used in 10 or 20 percent solutions. Do not treat plants when rain is forecasted within the next 6-8 hours. Source: mdc.mo.gov");
    Plant treeOfHeaven = new Plant("Tree of Heaven", true, true, true, true, "Tree", "treeofheaven", "Tree of heaven is very hard to control. Hand pulling young seedlings when the soil is moist is effective as long as there are not any root fragments left, which the tree could use to regrow. Herbicides applied to the roots in mid to late summer are effective. Outside of this window, herbicides only affect above ground growth. Herbicides applied to the bark,  foliage, or frill cuts can also be affective. Use herbicides with glyphosate or triclopyr. Source: psu.edu");
    Plant scotchBroom = new Plant ("Scotch Broom", false, false, false, true, "Bush", "scotchbroom", "Small batches of Scotch Broom can be controlled through hand pulling. When pulling, be careful to remove the entire root by pulling from the base of the plant. Alternatively, continually mow the scotch broom until it stops coming back. However, scotch broom seeds can still sprout up to 80 years after being deposited in the soil, so it's difficult to ensure that the scotch broom has been eradicated. Consider using an environmentally-friendly herbicide, or consulting a professional to try introducing a species that will eat the seeds. Source: gardeningknowhow.com");
    Plant barberry = new Plant ("Barberry", true, false, true, false, "bush", "barberry", "Barberry bushes are easy to identify - they grow leaves early in the season, which then change into bright yellow or orange in the fall. When removing, be careful and wear thick gloves, as some species have thorns. If the ground isn't frozen, the easiest way to remove smaller barberry plants is by simply digging it up with a shovel. Larger bushes are removed by first cutting the bush down to a short stump, then applying an environmentally-friendly herbicide or, better yet, intense heat from a blowtorch to ensure it doesn't grow back. Source: techlinenews.com");
    Plant privet = new Plant ("Privet", true, true, false, false, "bush", "privet", "The first step to destroying privet is to cut it down to a stump. For larger bushes you may need a chainsaw! However, if you just leave the stump, it will grow back within a year, so further action is needed. For smaller privet bushes, you can dig up the stump using a shovel, but for larger bushes, you'll probably need to use a stump grinder to ensure it won't come back. If you don't have access to a stump grinder, you can either use an environmentally-friendly herbicide on the stump or revisit the area frequently to pull up sprouts from the stump until they stop coming back. No matter what you do, you'll want to smother any future seedlings by treating the area with herbicide. Mix the herbicide in a 25 percent solution with water plus two teaspoons of dish soap to help the chemical stick to the foliage. Source: homeguides.sfgate.com");
    Plant canadaThistle = new Plant ("Canada Thistle", true, true, true, true, "abp", "canadathistle", "The Canada Thistle can be  very difficult to control or eradicate, and requires a combination of herbicides and cutting over a long period of time. Herbicides shold only be used on sunny days when temperatures are between 65 and 85 degrees Farenheight. When cutting Canada Thistle, cut at the base of the plant, but do not pull the root, as this will allow it to break off and grow more Check back every few days for to cut down any regrowth. Source: gardeningknowhow.com");
    Plant leafySpurge = new Plant("Leafy Spurge", true, false, true, true, "abp", "leafyspurge", "Leafy Spurge can only be adequately controlled through spraying herbicides. Roundup can be used in a 33% solution and applied mid-August to mid-September. A followup 25% solution of 2, 4-D amine can be applied between mid-June and mid-July of the following year to destroy seedlings. These herbicides are nondiscriminatory, so be careful to not spray native plants. Source: mdc.mo.gov");
    Plant spottedKnapweed = new Plant("Spotted Knapweed", true, true, true, true, "abp", "spottedknapweed","Hand pulling spotted knapweed has only been found to be effective in small infested areas, when pulling is done in the Spring, Summer, and late Summer over a period of 5 years. Becareful to remove the entire root with little as littel disturbance to the soil as possible. For larger outbreaks, herbicides are the only viable solution. The most effective one is Aminopyralid, when applied to the plants form the rosette to the bolting stage. Source: wric.ucdavis.edu");
    Plant cogongrass = new Plant("Cogongrass", false, true, false, false, "abp", "cogongrass", "Cogongrass in small patches can be treated with glyphosate  based herbicides. A 4% sloution of 41% active ingredient material (5 1/3 fluid ounces per gallon of water) should be sprayed on leaves  in early Fall.  Regrowth should be treated in the following  Spring and the Fall ofter that.  Larger infestations should be treated using a tractor mounted boom sprayer. Source: cogongrass.org");


    public ArrayList<Plant> create(){
        Singleton.getInstance().addToArray(englishIvy);
        Singleton.getInstance().addToArray(japanesePachysandra);
        Singleton.getInstance().addToArray(periwinkle);
        Singleton.getInstance().addToArray(garlicMustard);
        Singleton.getInstance().addToArray(japaneseStiltgrass);
        Singleton.getInstance().addToArray(honeysuckle);
        Singleton.getInstance().addToArray(autumnOlive);
        Singleton.getInstance().addToArray(treeOfHeaven);
        Singleton.getInstance().addToArray(scotchBroom);
        Singleton.getInstance().addToArray(barberry);
        Singleton.getInstance().addToArray(privet);
        Singleton.getInstance().addToArray(goutweed);
        Singleton.getInstance().addToArray(canadaThistle);
        Singleton.getInstance().addToArray(leafySpurge);
        Singleton.getInstance().addToArray(spottedKnapweed);
        Singleton.getInstance().addToArray(cogongrass);

        return list;
    }

    public void change(ArrayList<Plant> input) {
        this.list=input;
    }

}
