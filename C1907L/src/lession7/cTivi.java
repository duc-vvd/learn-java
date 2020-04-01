/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession7;

/**
 *
 * @author ADMIN
 */
public class cTivi {
    private String[] channeList;
    private boolean isOn;
    private String currentChannel;

    public cTivi() {
        isOn = false;
        channeList = new String[]{"VTV1", "VTV2", "VTV3"};
        currentChannel = "VTV1";
    }

    public cTivi(String[] channeList) {
        this.channeList = channeList;
        isOn = false;
        currentChannel = channeList[0];
    }
    
    private String seachNextChannel(boolean isForward){
        int index = 0;
            
        for(int i = 0; i < channeList.length; i++){
            if(channeList[i].equals(currentChannel)){
                index = i;
                break;
            }
        }
        
        if(isForward){
            if(index == (channeList.length - 1)){
                return channeList[0];
            }else{
                return channeList[index + 1];
            }
        }else{
            if(index == 0){
                return channeList[channeList.length - 1];
            }else{
                return channeList[index - 1];
            }
        }
    }
    
    public void On(){
        isOn = true;
        System.out.println("---Tivi ON---");
    }
    
    public void Off(){
        isOn = false;
        System.out.println("---Tivi OFF---");
    }
    
    public void Switch(){
        if(isOn){
            isOn = !isOn;
            System.out.println("---Tivi OFF---");
        }
        else{
            isOn = !isOn;
            System.out.println("---Tivi ON---");
        }
    }
    
    public void Switch(String channel){
        if(isOn){
            isOn = !isOn;
            System.out.println("---Tivi OFF---");
        }
        else{
            isOn = !isOn;
            System.out.println("---Tivi ON---");
            int t = 0;
            for(int i = 0; i < channeList.length; i++){
                if(channeList[i].equals(channel)){
                    currentChannel = channel;
                    System.out.println("Tìm thấy kênh đã nhập");
                    t++;
                    break;
                }
            }
            if(t == 0){
                System.out.println("Không tìm thấy kênh đã nhập!");
            }
        }
    }
    
    public void nextChannel(){
        if(isOn){
            currentChannel = seachNextChannel(true);
            System.out.println(currentChannel);
        }
    }
    
    public void previousChannel(){
        if(isOn){
            currentChannel = seachNextChannel(false);
            System.out.println(currentChannel);
        }
    }
    
    public void Show(){
        if(isOn){
            System.out.println("---Tivi is On at channel : " + currentChannel + " ---");
        }else{
            System.out.println("---- Tivi now OFF! ----");
        }
    }
    
}
