/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gos.database.creator.service;

import com.gos.database.creator.domain.DataBase;
import java.sql.Driver;

/**
 *
 * @author Xue Liang
 */
public interface MySqlMetaDataReader {
     DataBase read(Driver driver,String url,String user,String password) throws Exception;
}
