package com.BoardiesITSolutions.AndroidMySQLConnector;

import com.BoardiesITSolutions.AndroidMySQLConnector.Exceptions.InvalidSQLPacketException;
import com.BoardiesITSolutions.AndroidMySQLConnector.Exceptions.MySQLConnException;
import com.BoardiesITSolutions.AndroidMySQLConnector.Exceptions.MySQLException;

import java.io.IOException;

public interface IResultInterface
{
    void executionComplete(ResultSet resultSet);
    void handleInvalidSQLPacketException(InvalidSQLPacketException ex);
    void handleMySQLException(MySQLException ex);
    void handleIOException(IOException ex);
    void handleMySQLConnException(MySQLConnException ex);
    void handleException(Exception ex);
}
