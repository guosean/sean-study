package com.lucene;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.store.LockObtainFailedException;
import org.apache.lucene.util.Version;
import org.junit.Test;
import org.wltea.analyzer.lucene.IKAnalyzer;


/**
 * <p> Copyright 200 by Asiainfo-Linkage Software corporation
 * <p>All rights reserved.
 * <p>版权所有：亚信联创
 * <p>未经本公司许可，不得以任何方式复制或使用本程序任何部分，
 * <p>侵权者将受到法律追究。
 * @PURPOSE:  TODO
 * @DESCRIPTION: TODO
 * @AUTHOR: guozb
 * @DATE: 2014-6-13
 * @VERSION PSMA
 * @SINCE 1.0
 * @HISTORY: 2.0
 */
public class TestIndexer {
	
    public static final	String indexPath = "./ikIndex";//"./productIndex";
	@Test
	public void testIndex() throws CorruptIndexException, LockObtainFailedException, IOException{
		//standard
	/*	Analyzer sd = new StandardAnalyzer(Version.LUCENE_30);
		index(sd);*/
		//ik
		Analyzer ik = new IKAnalyzer();
		index(ik);
		System.out.println("索引ok");
	}

	/**
	 * @throws CorruptIndexException
	 * @throws LockObtainFailedException
	 * @throws IOException
	 */
	private void index(Analyzer analyzer) throws CorruptIndexException,
			LockObtainFailedException, IOException {
		IndexWriterConfig config = new IndexWriterConfig(Version.LUCENE_30, analyzer);
		IndexWriter writer = new IndexWriter(FSDirectory.open(new File(indexPath)), config);
		String[][] rules = {{"梦网:5","短信:3"},{"梦网:5","彩信:3"},{"国际:5","短信:3"}};
		String[] pros = {"梦网短信","梦网彩信","国际短信"};
		int len = rules.length;
		String[] ruleScore = null;
		String proName = "";
		Document doc;
		for(int i=0; i<len; i++){
			 ruleScore = rules[i];
			 proName = pros[i];
			 doc = new Document();
			 doc.add(new Field("product",proName,Field.Store.YES,Field.Index.NOT_ANALYZED));
			 for (int j = 0; j < ruleScore.length; j++) {
				 String[] rs = StringUtils.splitByWholeSeparator(ruleScore[j], ":");
					Field field = new Field("rule"+j,rs[0],Field.Store.YES,Field.Index.ANALYZED);
					 field.setBoost(Float.valueOf(rs[1]));
					 doc.add(field); 
				 
			}
			 writer.addDocument(doc);
		}
		 writer.optimize();
		 writer.close();
	}
	
	public Map<String,Integer> transToMap(final String[] ruleScore){
		Map<String, Integer> rl = new HashMap<String, Integer>();
		for(String rule:ruleScore){
			String[] rs = StringUtils.splitByWholeSeparator(rule, ":");
			rl.put(rs[0], Integer.valueOf(rs[1]));
		}
		return rl;
	}

}
