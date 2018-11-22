package com.itheima.test;

import com.sun.xml.internal.stream.events.StartDocumentEvent;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import java.io.File;
import java.nio.file.Paths;

/**
 * @Author: Liutonglin
 * @Date: 2018/11/22 10:36
 */
public class LuceneTest {
    public void indexWrite() throws Exception {
        Directory d = FSDirectory.open(Paths.get("D:\\Lucene\\index"));
        IndexWriterConfig conf = new IndexWriterConfig(new StandardAnalyzer());
        IndexWriter indexWriter = new IndexWriter(d, conf);
        File sourcefile = new File("D:\\Lucene\\source");
        File[] files = sourcefile.listFiles();
        for (File file : files) {

        }

    }
}
