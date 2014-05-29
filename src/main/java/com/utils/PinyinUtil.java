package com.utils;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

import org.junit.Test;

/**
 * <p> Copyright 200 by Asiainfo-Linkage Software corporation
 * <p>All rights reserved.
 * <p>版权所有：亚信联创
 * <p>未经本公司许可，不得以任何方式复制或使用本程序任何部分，
 * <p>侵权者将受到法律追究。
 * @PURPOSE:  TODO
 * @DESCRIPTION: TODO
 * @AUTHOR: guozb
 * @DATE: 2014-4-11
 * @VERSION PSMA
 * @SINCE 1.0
 * @HISTORY: 2.0
 */
public class PinyinUtil {
	@Test
	public void testPinyin() throws BadHanyuPinyinOutputFormatCombination{
		HanyuPinyinOutputFormat format=new HanyuPinyinOutputFormat();
		format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        char chr = '巷';
        System.out.println("hanyu==");
        printHanyuPinyin(chr);
        System.out.println("GwoyeuRomatzyh");
        printGwoyeuRomatzyhPinyin(chr);
        System.out.println("MPS");
        printMPS2Pinyin(chr);
        System.out.println("Tongyong");
        printTongyongPinyin(chr);
        System.out.println("Wade");
        printWadeGilesPinyin(chr);
        System.out.println("Yale");
        printYalePinyin(chr);
	}

	/**
	 * @param chr
	 */
	private void printHanyuPinyin(char chr) {
		String[] pinyin=PinyinHelper.toHanyuPinyinStringArray(chr);
        for (String py : pinyin) {
			System.out.println(py);
		}
	}
	private void printGwoyeuRomatzyhPinyin(char chr) {
		String[] pinyin=PinyinHelper.toGwoyeuRomatzyhStringArray(chr);
        for (String py : pinyin) {
			System.out.println(py);
		}
	}
	private void printMPS2Pinyin(char chr) {
		String[] pinyin=PinyinHelper.toMPS2PinyinStringArray(chr);
        for (String py : pinyin) {
			System.out.println(py);
		}
	}
	private void printTongyongPinyin(char chr) {
		String[] pinyin=PinyinHelper.toTongyongPinyinStringArray(chr);
        for (String py : pinyin) {
			System.out.println(py);
		}
	}
	private void printWadeGilesPinyin(char chr) {
		String[] pinyin=PinyinHelper.toWadeGilesPinyinStringArray(chr);
        for (String py : pinyin) {
			System.out.println(py);
		}
	}
	private void printYalePinyin(char chr) {
		String[] pinyin=PinyinHelper.toYalePinyinStringArray(chr);
        for (String py : pinyin) {
			System.out.println(py);
		}
	}

}
