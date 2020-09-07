/*
 * Created by JFormDesigner on Fri Jun 26 11:20:47 CST 2020
 */

package com.lvsrobot.vehicle.exchange;

import javax.swing.border.*;
import com.google.inject.assistedinject.Assisted;
//import org.opentcs.commadapter.vehicle.ExampleProcessModel;
import com.lvsrobot.vehicle.ExampleProcessModel;
//import de.fraunhofer.iml.opentcs.example.commadapter.vehicle.telegrams.OrderRequest;
import org.opentcs.components.kernel.services.VehicleService;
import org.opentcs.customizations.ServiceCallWrapper;
import org.opentcs.drivers.vehicle.management.VehicleCommAdapterPanel;
import org.opentcs.drivers.vehicle.management.VehicleProcessModelTO;
import com.lvsrobot.vehicle.ExampleProcessModelTO;
import org.opentcs.util.CallWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.swing.*;
import javax.swing.GroupLayout;

import static java.util.Objects.requireNonNull;

/**
 * @author Benoni Jiang
 */
public class myPanel2 extends VehicleCommAdapterPanel {
//    private final DefaultListModel<OrderRequest> lastOrderListModel = new DefaultListModel<>();
    private static final Logger LOG = LoggerFactory.getLogger(myPanel2.class);
    private final VehicleService vehicleService;
    private final CallWrapper callWrapper;
    private ExampleProcessModelTO processModel;

    @Inject
    public myPanel2(@Assisted ExampleProcessModelTO processModel,
                    @Assisted VehicleService vehicleService,
                    @ServiceCallWrapper CallWrapper callWrapper) {
        this.processModel = requireNonNull(processModel, "processModel");
        this.vehicleService = requireNonNull(vehicleService, "vehicleService");
        this.callWrapper = requireNonNull(callWrapper, "callWrapper");
        initComponents();
    }

    @Override
    public void processModelChange(String attributeChanged, VehicleProcessModelTO newProcessModel) {
        if(!(newProcessModel instanceof ExampleProcessModelTO)) {
            return;
        }

        processModel = (ExampleProcessModelTO) newProcessModel;
        updateExampleVehicleModelData(attributeChanged, processModel);
        updateVehiceProcessModelData(attributeChanged, processModel);
    }

    private void updateExampleVehicleModelData(String attributeChanged,
                                               ExampleProcessModelTO processModel) {

    }

    private void updateVehiceProcessModelData(String attributeChanged,
                                              VehicleProcessModelTO processModel) {

    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        button8 = new JButton();
        button9 = new JButton();
        button1 = new JButton();
        button3 = new JButton();
        button7 = new JButton();
        button4 = new JButton();
        button6 = new JButton();
        button2 = new JButton();
        button5 = new JButton();
        slider1 = new JSlider();
        label2 = new JLabel();
        label3 = new JLabel();
        button10 = new JButton();
        button11 = new JButton();
        panel2 = new JPanel();
        label1 = new JLabel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        button12 = new JButton();
        button13 = new JButton();
        button14 = new JButton();
        button15 = new JButton();
        button16 = new JButton();
        panel5 = new JPanel();
        scrollPane2 = new JScrollPane();
        list1 = new JList();
        panel6 = new JPanel();
        textField1 = new JTextField();
        label4 = new JLabel();
        button17 = new JButton();

        //======== this ========
        setBorder(null);

        //======== panel1 ========
        {
            panel1.setBorder(new TitledBorder("\u624b\u52a8\u63a7\u5236"));

            //---- button8 ----
            button8.setText("\u4e3e\u5347");

            //---- button9 ----
            button9.setText("\u4e0b\u964d");

            //---- button1 ----
            button1.setText("\u540e\u9000");

            //---- button3 ----
            button3.setText("\u5de6\u79fb");

            //---- button7 ----
            button7.setText("\u505c\u6b62");

            //---- button4 ----
            button4.setText("\u53f3\u79fb");

            //---- button6 ----
            button6.setText("\u53cd\u8f6c");

            //---- button2 ----
            button2.setText("\u524d\u8fdb");

            //---- button5 ----
            button5.setText("\u6b63\u8f6c");

            //---- label2 ----
            label2.setText("\u901f\u5ea6");

            //---- label3 ----
            label3.setText("\u901f\u5ea6:");

            //---- button10 ----
            button10.setText("\u4f38\u51fa");

            //---- button11 ----
            button11.setText("\u6536\u56de");

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                        .addComponent(label2)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slider1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14))
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                        .addComponent(button5, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(button6, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(button8)
                                            .addGap(24, 24, 24)
                                            .addComponent(button9))
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(panel1Layout.createParallelGroup()
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addComponent(button7, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(button4, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(button10)
                                            .addGap(24, 24, 24)
                                            .addComponent(button11)))
                                    .addContainerGap()))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(label3)
                                .addGap(91, 91, 91))))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(slider1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button6)
                            .addComponent(button5)
                            .addComponent(button2))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button3)
                            .addComponent(button7)
                            .addComponent(button4))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button1)
                        .addGap(12, 12, 12)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button9)
                            .addComponent(button8))
                        .addGap(12, 12, 12)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button11)
                            .addComponent(button10))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        //======== panel2 ========
        {
            panel2.setBorder(LineBorder.createBlackLineBorder());

            //---- label1 ----
            label1.setText("Camera");

            //======== panel3 ========
            {

                GroupLayout panel3Layout = new GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup()
                        .addGap(0, 353, Short.MAX_VALUE)
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addGap(0, 103, Short.MAX_VALUE)
                );
            }

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(287, Short.MAX_VALUE))
                    .addComponent(panel3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))
            );
        }

        //======== panel4 ========
        {
            panel4.setBorder(new TitledBorder("\u81ea\u52a8\u63a7\u5236"));

            //---- button12 ----
            button12.setText("\u6682\u505c\u8def\u5f84");

            //---- button13 ----
            button13.setText("\u7ee7\u7eed\u8def\u5f84");

            //---- button14 ----
            button14.setText("\u6e05\u9664\u62a5\u8b66");

            //---- button15 ----
            button15.setText("\u53c9\u8d27");

            //---- button16 ----
            button16.setText("\u5378\u8d27");

            GroupLayout panel4Layout = new GroupLayout(panel4);
            panel4.setLayout(panel4Layout);
            panel4Layout.setHorizontalGroup(
                panel4Layout.createParallelGroup()
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(button14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button16, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel4Layout.setVerticalGroup(
                panel4Layout.createParallelGroup()
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(button12)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button13)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button14)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button15)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button16)
                        .addContainerGap(84, Short.MAX_VALUE))
            );
        }

        //======== panel5 ========
        {
            panel5.setBorder(new TitledBorder("\u901a\u4fe1\u65e5\u5fd7"));

            //======== scrollPane2 ========
            {
                scrollPane2.setViewportView(list1);
            }

            GroupLayout panel5Layout = new GroupLayout(panel5);
            panel5.setLayout(panel5Layout);
            panel5Layout.setHorizontalGroup(
                panel5Layout.createParallelGroup()
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
            );
            panel5Layout.setVerticalGroup(
                panel5Layout.createParallelGroup()
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 24, Short.MAX_VALUE))
            );
        }

        //======== panel6 ========
        {
            panel6.setBorder(new TitledBorder("\u624b\u52a8\u53d1\u9001\u6307\u4ee4"));

            //---- label4 ----
            label4.setText("\u6307\u4ee4:");

            //---- button17 ----
            button17.setText("\u53d1\u9001");

            GroupLayout panel6Layout = new GroupLayout(panel6);
            panel6.setLayout(panel6Layout);
            panel6Layout.setHorizontalGroup(
                panel6Layout.createParallelGroup()
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(label4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button17)
                        .addGap(29, 29, 29))
            );
            panel6Layout.setVerticalGroup(
                panel6Layout.createParallelGroup()
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4)
                            .addComponent(button17))
                        .addContainerGap(85, Short.MAX_VALUE))
            );
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(panel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(172, 172, 172)))))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(panel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(panel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        getAccessibleContext().setAccessibleName("myPanel2");
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JButton button8;
    private JButton button9;
    private JButton button1;
    private JButton button3;
    private JButton button7;
    private JButton button4;
    private JButton button6;
    private JButton button2;
    private JButton button5;
    private JSlider slider1;
    private JLabel label2;
    private JLabel label3;
    private JButton button10;
    private JButton button11;
    private JPanel panel2;
    private JLabel label1;
    private JPanel panel3;
    private JPanel panel4;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JPanel panel5;
    private JScrollPane scrollPane2;
    private JList list1;
    private JPanel panel6;
    private JTextField textField1;
    private JLabel label4;
    private JButton button17;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}