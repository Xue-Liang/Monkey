/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gos.database.creator.service;

import com.gos.database.creator.domain.DataBase;

/**
 *
 * @author Xue Liang
 */
public interface MySqlCreatorService {
    public boolean createEntities(DataBase dataBase,String dir,String packageName) throws Exception;
    
    public boolean createDao(DataBase dataBase,String dir,String entityPackageName,String daoPackageName) throws Exception;
    
    public boolean createService(DataBase dataBase,String dir,String entityPackageName,String daoPackageName,String servicePackageName) throws Exception; 
   
}
