package com.example.demo.Prefix;

import static org.testng.Assert.assertEquals;
import java.util.ArrayList;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;


public class PrefixTest  extends AbstractTestNGSpringContextTests{

  @Test
  public void prefixTest() {
      ArrayList<String> arrayList=new ArrayList<String>();
      arrayList.add("asdfghjkl");
      arrayList.add("asdfjhvb");
      arrayList.add("asdfiurtgnjnbjenb");
      arrayList.add("asdfijtgjrtnb");
      assertEquals("asdf", Prefix.prefix(arrayList));

  }
}
