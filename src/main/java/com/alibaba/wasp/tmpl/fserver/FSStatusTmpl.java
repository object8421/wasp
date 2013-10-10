// Autogenerated Jamon proxy
// /Users/jaywong/data/opensource/hadoop/wasp/github/wasp/src/main/jamon/./com/alibaba/wasp/tmpl/fserver/FSStatusTmpl.jamon

package com.alibaba.wasp.tmpl.fserver;

// 25, 1
import java.util.*;
// 26, 1
import com.alibaba.wasp.fserver.FServer;
// 27, 1
import org.apache.hadoop.hbase.util.Bytes;
// 28, 1
import com.alibaba.wasp.EntityGroupInfo;
// 29, 1
import com.alibaba.wasp.ServerName;
// 30, 1
import com.alibaba.wasp.conf.WaspConfiguration;
// 31, 1
import com.alibaba.wasp.protobuf.ProtobufUtil;
// 32, 1
import com.alibaba.wasp.protobuf.generated.FServerAdminProtos.ServerInfo;
// 33, 1
import com.alibaba.wasp.EntityGroupLoad;

@org.jamon.annotations.Template(
  signature = "B07351B4D8CF91D63B91D4D446B817E3",
  requiredArguments = {
    @org.jamon.annotations.Argument(name = "fserver", type = "FServer")},
  optionalArguments = {
    @org.jamon.annotations.Argument(name = "filter", type = "String"),
    @org.jamon.annotations.Argument(name = "format", type = "String")})
public class FSStatusTmpl
  extends org.jamon.AbstractTemplateProxy
{
  
  public FSStatusTmpl(org.jamon.TemplateManager p_manager)
  {
     super(p_manager);
  }
  
  public FSStatusTmpl()
  {
     super("/com/alibaba/wasp/tmpl/fserver/FSStatusTmpl");
  }
  
  protected interface Intf
    extends org.jamon.AbstractTemplateProxy.Intf{
    
    void renderNoFlush(final java.io.Writer jamonWriter) throws java.io.IOException;
    
  }
  public static class ImplData
    extends org.jamon.AbstractTemplateProxy.ImplData
  {
    // 20, 1
    public void setFserver(FServer fserver)
    {
      // 20, 1
      m_fserver = fserver;
    }
    public FServer getFserver()
    {
      return m_fserver;
    }
    private FServer m_fserver;
    // 21, 1
    public void setFilter(String filter)
    {
      // 21, 1
      m_filter = filter;
      m_filter__IsNotDefault = true;
    }
    public String getFilter()
    {
      return m_filter;
    }
    private String m_filter;
    public boolean getFilter__IsNotDefault()
    {
      return m_filter__IsNotDefault;
    }
    private boolean m_filter__IsNotDefault;
    // 22, 1
    public void setFormat(String format)
    {
      // 22, 1
      m_format = format;
      m_format__IsNotDefault = true;
    }
    public String getFormat()
    {
      return m_format;
    }
    private String m_format;
    public boolean getFormat__IsNotDefault()
    {
      return m_format__IsNotDefault;
    }
    private boolean m_format__IsNotDefault;
  }
  @Override
  protected ImplData makeImplData()
  {
    return new ImplData();
  }
  @Override @SuppressWarnings("unchecked") public ImplData getImplData()
  {
    return (ImplData) super.getImplData();
  }
  
  protected String filter;
  public final com.alibaba.wasp.tmpl.fserver.FSStatusTmpl setFilter(String p_filter)
  {
    (getImplData()).setFilter(p_filter);
    return this;
  }
  
  protected String format;
  public final com.alibaba.wasp.tmpl.fserver.FSStatusTmpl setFormat(String p_format)
  {
    (getImplData()).setFormat(p_format);
    return this;
  }
  
  
  @Override
  public org.jamon.AbstractTemplateImpl constructImpl(Class<? extends org.jamon.AbstractTemplateImpl> p_class){
    try
    {
      return p_class
        .getConstructor(new Class [] { org.jamon.TemplateManager.class, ImplData.class })
        .newInstance(new Object [] { getTemplateManager(), getImplData()});
    }
    catch (RuntimeException e)
    {
      throw e;
    }
    catch (Exception e)
    {
      throw new RuntimeException(e);
    }
  }
  
  @Override
  protected org.jamon.AbstractTemplateImpl constructImpl(){
    return new FSStatusTmplImpl(getTemplateManager(), getImplData());
  }
  public org.jamon.Renderer makeRenderer(final FServer fserver)
  {
    return new org.jamon.AbstractRenderer() {
      @Override
      public void renderTo(final java.io.Writer jamonWriter)
        throws java.io.IOException
      {
        render(jamonWriter, fserver);
      }
    };
  }
  
  public void render(final java.io.Writer jamonWriter, final FServer fserver)
    throws java.io.IOException
  {
    renderNoFlush(jamonWriter, fserver);
    jamonWriter.flush();
  }
  public void renderNoFlush(final java.io.Writer jamonWriter, final FServer fserver)
    throws java.io.IOException
  {
    ImplData implData = getImplData();
    implData.setFserver(fserver);
    Intf instance = (Intf) getTemplateManager().constructImpl(this);
    instance.renderNoFlush(jamonWriter);
    reset();
  }
  
  
}
