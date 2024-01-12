package org.launchcode;

public class CD extends Media implements OpticalDisc {
    private boolean isMusicCD;

    public CD(String name, boolean isMusicCD) {
        super(name, "", 800, 700);
        this.isMusicCD = isMusicCD;
        setDiscType(isMusicCD ? "music CD" : " CD-RW");
        public CD (String name){
            this(name, false);
        }
    }

    public boolean isMusicCD() {
        return isMusicCD;
    }

    public void setMusicCD(boolean musicCD) {
        isMusicCD = musicCD;
    }
    @Override
    public String toString(){
        String header = isMusicCD ? "Tracks" : " Files";
        return super.toString() + getFormattedFileList(header);
    }

    @Override
    public void writeFile(File file) {
        spinDisc();
        String fileType = isMusicCD ? "track" : "file"
    }

    @Override
    public void removeFile(File file) {

    }

    @Override
    public void reformatDisc() {

    }

    @Override
    public void runFile(File file) {

    }
}

