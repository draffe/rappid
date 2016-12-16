package Engine;

import Models.Data;
import io.realm.Realm;

/**
 * Created by draffe on 16/12/2016.
 */
public class PersistenData {
    Realm realm;
    public  PersistenData(Realm myRealm)
    {
        realm = myRealm;

    }

    public int NumerData()
    {

       return realm.where(Data.class).findAll().size();
    }

    public Data get(int i)
    {
       return realm.where(Data.class).findAll().get(i);

    }


    public  void DeleteAll()
    {

       realm.beginTransaction();

        realm.delete(Data.class);
        realm.commitTransaction();
    }

     public  void InsertData(Data In)
     {
         realm.beginTransaction();

         realm.insert(In);
         realm.commitTransaction();
     }
}
