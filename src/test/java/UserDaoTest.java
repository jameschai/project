import com.gymx.user.dao.IUserDao;
import com.gymx.user.model.User;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/5/2.
 */
public class UserDaoTest extends AbstractIT {

    @Resource
    private IUserDao userDao;

    @Test
    public void QueryTest(){
//        userDao.findAllUsers();
        userDao.findUserByName("sysadmin");
    }

    @Test
    public void saveTest(){
        User user = new User();
        user.setName("admin");
        user.setPassword("1234");
        userDao.save(user);
    }

    @Test
    public void updateTest(){
        User user = userDao.findUserByName("admin");
        user.setPassword("123456");
        userDao.update(user);
    }

    @Test
    public void deleteTest(){
        User user = userDao.findUserByName("admin");
        userDao.delete(user.getId());
    }

}
