package com.alkor.vph.vk;

/**
 * Author: akorobitsyn
 * Date: 03.07.13
 * Time: 14:41
 */
public interface TokenProvider {

    String getToken();

    void switchToken();

}
