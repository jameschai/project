import com.gymx.user.service.IUserService;
import org.junit.Test;
import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.*;

/**
 * Created by Administrator on 2017/5/1.
 */

public class SpringTest extends AbstractIT{

    @Resource
    private IUserService userService;

    @Resource
    private DataSource dataSource;

    @Test
    public void test(){
        userService.test();
    }

    @Test
    public void dataSourceTest(){
        try {
            String sql = "select * from user";
            Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                logger.info("userName:" + rs.getString("name"));
                System.out.println(rs.getString("name")+","+rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
