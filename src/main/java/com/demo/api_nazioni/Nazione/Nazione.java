package com.demo.api_nazioni.Nazione;

import lombok.Data;

public @Data
class Nazione {
    private Object id;
    private Object nazione;
    private Object sigla;
    private Object _2000;
    private Object _2001;
    private Object _2002;
    private Object _2003;
    private Object _2004;
    private Object _2005;
    private Object _2006;
    private Object _2007;
    private Object _2008;
    private Object _2009;
    private Object _2010;
    private Object _2011;
    private Object _2012;
    private Object _2013;
    private Object _2014;
    private Object _2015;
    private Object _2016;
    private Object _2017;

    public Nazione(Object id, Object nazione, Object sigla, Object _2000, Object _2001, Object _2002, Object _2003, Object _2004, Object _2005, Object _2006,
                   Object _2007, Object _2008, Object _2009, Object _2010, Object _2011, Object _2012, Object _2013, Object _2014, Object _2015,
                   Object _2016, Object _2017)
    {
        this.id = id;
        this.nazione = nazione;
        this.sigla = sigla;
        this._2000 = _2000;
        this._2001 = _2001;
        this._2002 = _2002;
        this._2003 = _2003;
        this._2004 = _2004;
        this._2005 = _2005;
        this._2006 = _2006;
        this._2007 = _2007;
        this._2008 = _2008;
        this._2009 = _2009;
        this._2010 = _2010;
        this._2011 = _2011;
        this._2012 = _2012;
        this._2013 = _2013;
        this._2014 = _2014;
        this._2015 = _2015;
        this._2016 = _2016;
        this._2017 = _2017;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getNazione() {
        return nazione;
    }

    public void setNazione(Object nazione) {
        this.nazione = nazione;
    }

    public Object getSigla() {
        return sigla;
    }

    public void setSigla(Object sigla) {
        this.sigla = sigla;
    }

    public Object get_2000() {
        return _2000;
    }

    public void set_2000(Object _2000) {
        this._2000 = _2000;
    }

    public Object get_2001() {
        return _2001;
    }

    public void set_2001(Object _2001) {
        this._2001 = _2001;
    }

    public Object get_2002() {
        return _2002;
    }

    public void set_2002(Object _2002) {
        this._2002 = _2002;
    }

    public Object get_2003() {
        return _2003;
    }

    public void set_2003(Object _2003) {
        this._2003 = _2003;
    }

    public Object get_2004() {
        return _2004;
    }

    public void set_2004(Object _2004) {
        this._2004 = _2004;
    }

    public Object get_2005() {
        return _2005;
    }

    public void set_2005(Object _2005) {
        this._2005 = _2005;
    }

    public Object get_2006() {
        return _2006;
    }

    public void set_2006(Object _2006) {
        this._2006 = _2006;
    }

    public Object get_2007() {
        return _2007;
    }

    public void set_2007(Object _2007) {
        this._2007 = _2007;
    }

    public Object get_2008() {
        return _2008;
    }

    public void set_2008(Object _2008) {
        this._2008 = _2008;
    }

    public Object get_2009() {
        return _2009;
    }

    public void set_2009(Object _2009) {
        this._2009 = _2009;
    }

    public Object get_2010() {
        return _2010;
    }

    public void set_2010(Object _2010) {
        this._2010 = _2010;
    }

    public Object get_2011() {
        return _2011;
    }

    public void set_2011(Object _2011) {
        this._2011 = _2011;
    }

    public Object get_2012() {
        return _2012;
    }

    public void set_2012(Object _2012) {
        this._2012 = _2012;
    }

    public Object get_2013() {
        return _2013;
    }

    public void set_2013(Object _2013) {
        this._2013 = _2013;
    }

    public Object get_2014() {
        return _2014;
    }

    public void set_2014(Object _2014) {
        this._2014 = _2014;
    }

    public Object get_2015() {
        return _2015;
    }

    public void set_2015(Object _2015) {
        this._2015 = _2015;
    }

    public Object get_2016() {
        return _2016;
    }

    public void set_2016(Object _2016) {
        this._2016 = _2016;
    }

    public Object get_2017() {
        return _2017;
    }

    public void set_2017(Object _2017) {
        this._2017 = _2017;
    }

    @Override
    public String toString() {
        return "Nazione{" +
                "id=" + id +
                ", nazione=" + nazione +
                ", sigla=" + sigla +
                ", _2000=" + _2000 +
                ", _2001=" + _2001 +
                ", _2002=" + _2002 +
                ", _2003=" + _2003 +
                ", _2004=" + _2004 +
                ", _2005=" + _2005 +
                ", _2006=" + _2006 +
                ", _2007=" + _2007 +
                ", _2008=" + _2008 +
                ", _2009=" + _2009 +
                ", _2010=" + _2010 +
                ", _2011=" + _2011 +
                ", _2012=" + _2012 +
                ", _2013=" + _2013 +
                ", _2014=" + _2014 +
                ", _2015=" + _2015 +
                ", _2016=" + _2016 +
                ", _2017=" + _2017 +
                '}';
    }

    public Double getDato(String dato) {
        Double valore = (double) 0;
        if(("_" + dato).equals("_2000")){
            valore = Double.parseDouble(_2000.toString());
        }
        if(("_" + dato).equals("_2001")){
            valore = Double.parseDouble(_2001.toString());
        }
        if(("_" + dato).equals("_2002")){
            valore = Double.parseDouble(_2002.toString());
        }
        if(("_" + dato).equals("_2003")){
            valore = Double.parseDouble(_2003.toString());
        }
        if(("_" + dato).equals("_2004")){
            valore = Double.parseDouble(_2004.toString());
        }
        if(("_" + dato).equals("_2005")){
            valore = Double.parseDouble(_2005.toString());
        }
        if(("_" + dato).equals("_2006")){
            valore = Double.parseDouble(_2006.toString());
        }
        if(("_" + dato).equals("_2007")){
            valore = Double.parseDouble(_2007.toString());
        }
        if(("_" + dato).equals("_2008")){
            valore = Double.parseDouble(_2008.toString());
        }
        if(("_" + dato).equals("_2009")){
            valore = Double.parseDouble(_2009.toString());
        }
        if(("_" + dato).equals("_2010")){
            valore = Double.parseDouble(_2010.toString());
        }
        if(("_" + dato).equals("_2011")){
            valore = Double.parseDouble(_2011.toString());
        }
        if(("_" + dato).equals("_2012")){
            valore = Double.parseDouble(_2012.toString());
        }
        if(("_" + dato).equals("_2013")){
            valore = Double.parseDouble(_2013.toString());
        }
        if(("_" + dato).equals("_2014")){
            valore = Double.parseDouble(_2014.toString());
        }
        if(("_" + dato).equals("_2015")){
            valore = Double.parseDouble(_2015.toString());
        }
        if(("_" + dato).equals("_2016")){
            valore = Double.parseDouble(_2016.toString());
        }
        if(("_" + dato).equals("_2017")){
            valore = Double.parseDouble(_2017.toString());
        }
        return valore;
    }
}
