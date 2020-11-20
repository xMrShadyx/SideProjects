
namespace Calculator
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.button_equal = new System.Windows.Forms.Button();
            this.button_minus = new System.Windows.Forms.Button();
            this.button_multiply = new System.Windows.Forms.Button();
            this.button_divide = new System.Windows.Forms.Button();
            this.button_back = new System.Windows.Forms.Button();
            this.button_c = new System.Windows.Forms.Button();
            this.button_9 = new System.Windows.Forms.Button();
            this.button_6 = new System.Windows.Forms.Button();
            this.button_3 = new System.Windows.Forms.Button();
            this.button12 = new System.Windows.Forms.Button();
            this.button_ce = new System.Windows.Forms.Button();
            this.button_8 = new System.Windows.Forms.Button();
            this.button_5 = new System.Windows.Forms.Button();
            this.button_2 = new System.Windows.Forms.Button();
            this.button_0 = new System.Windows.Forms.Button();
            this.button_modulos = new System.Windows.Forms.Button();
            this.button_7 = new System.Windows.Forms.Button();
            this.button_4 = new System.Windows.Forms.Button();
            this.button_1 = new System.Windows.Forms.Button();
            this.textBox_result = new System.Windows.Forms.TextBox();
            this.labelCurrentOperation = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // button_equal
            // 
            this.button_equal.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.button_equal.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_equal.Location = new System.Drawing.Point(235, 239);
            this.button_equal.Name = "button_equal";
            this.button_equal.Size = new System.Drawing.Size(77, 98);
            this.button_equal.TabIndex = 0;
            this.button_equal.Text = "=";
            this.button_equal.UseVisualStyleBackColor = true;
            this.button_equal.Click += new System.EventHandler(this.equal);
            // 
            // button_minus
            // 
            this.button_minus.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.button_minus.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_minus.Location = new System.Drawing.Point(235, 190);
            this.button_minus.Name = "button_minus";
            this.button_minus.Size = new System.Drawing.Size(77, 49);
            this.button_minus.TabIndex = 1;
            this.button_minus.Text = "-";
            this.button_minus.UseVisualStyleBackColor = true;
            this.button_minus.Click += new System.EventHandler(this.operator_click);
            // 
            // button_multiply
            // 
            this.button_multiply.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.button_multiply.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_multiply.Location = new System.Drawing.Point(235, 141);
            this.button_multiply.Name = "button_multiply";
            this.button_multiply.Size = new System.Drawing.Size(77, 49);
            this.button_multiply.TabIndex = 2;
            this.button_multiply.Text = "*";
            this.button_multiply.UseVisualStyleBackColor = true;
            this.button_multiply.Click += new System.EventHandler(this.operator_click);
            // 
            // button_divide
            // 
            this.button_divide.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.button_divide.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_divide.Location = new System.Drawing.Point(235, 92);
            this.button_divide.Name = "button_divide";
            this.button_divide.Size = new System.Drawing.Size(77, 49);
            this.button_divide.TabIndex = 3;
            this.button_divide.Text = "/";
            this.button_divide.UseVisualStyleBackColor = true;
            this.button_divide.Click += new System.EventHandler(this.operator_click);
            // 
            // button_back
            // 
            this.button_back.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.button_back.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_back.Location = new System.Drawing.Point(159, 288);
            this.button_back.Name = "button_back";
            this.button_back.Size = new System.Drawing.Size(77, 49);
            this.button_back.TabIndex = 5;
            this.button_back.Text = "+";
            this.button_back.UseVisualStyleBackColor = true;
            this.button_back.Click += new System.EventHandler(this.operator_click);
            // 
            // button_c
            // 
            this.button_c.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.button_c.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_c.Location = new System.Drawing.Point(159, 92);
            this.button_c.Name = "button_c";
            this.button_c.Size = new System.Drawing.Size(77, 49);
            this.button_c.TabIndex = 11;
            this.button_c.Text = "C";
            this.button_c.UseVisualStyleBackColor = true;
            this.button_c.Click += new System.EventHandler(this.clear_click);
            // 
            // button_9
            // 
            this.button_9.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.button_9.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_9.Location = new System.Drawing.Point(159, 141);
            this.button_9.Name = "button_9";
            this.button_9.Size = new System.Drawing.Size(77, 49);
            this.button_9.TabIndex = 9;
            this.button_9.Text = "9";
            this.button_9.UseVisualStyleBackColor = true;
            this.button_9.Click += new System.EventHandler(this.button_click);
            // 
            // button_6
            // 
            this.button_6.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.button_6.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_6.Location = new System.Drawing.Point(159, 190);
            this.button_6.Name = "button_6";
            this.button_6.Size = new System.Drawing.Size(77, 49);
            this.button_6.TabIndex = 8;
            this.button_6.Text = "6";
            this.button_6.UseVisualStyleBackColor = true;
            this.button_6.Click += new System.EventHandler(this.button_click);
            // 
            // button_3
            // 
            this.button_3.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.button_3.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_3.Location = new System.Drawing.Point(159, 239);
            this.button_3.Name = "button_3";
            this.button_3.Size = new System.Drawing.Size(77, 49);
            this.button_3.TabIndex = 7;
            this.button_3.Text = "3";
            this.button_3.UseVisualStyleBackColor = true;
            this.button_3.Click += new System.EventHandler(this.button_click);
            // 
            // button12
            // 
            this.button12.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.button12.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button12.Location = new System.Drawing.Point(82, 288);
            this.button12.Name = "button12";
            this.button12.Size = new System.Drawing.Size(77, 49);
            this.button12.TabIndex = 6;
            this.button12.Text = ".";
            this.button12.UseVisualStyleBackColor = true;
            this.button12.Click += new System.EventHandler(this.button_click);
            // 
            // button_ce
            // 
            this.button_ce.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.button_ce.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_ce.Location = new System.Drawing.Point(82, 92);
            this.button_ce.Name = "button_ce";
            this.button_ce.Size = new System.Drawing.Size(77, 49);
            this.button_ce.TabIndex = 17;
            this.button_ce.Text = "CE";
            this.button_ce.UseVisualStyleBackColor = true;
            this.button_ce.Click += new System.EventHandler(this.click_ce);
            // 
            // button_8
            // 
            this.button_8.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.button_8.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_8.Location = new System.Drawing.Point(82, 141);
            this.button_8.Name = "button_8";
            this.button_8.Size = new System.Drawing.Size(77, 49);
            this.button_8.TabIndex = 15;
            this.button_8.Text = "8";
            this.button_8.UseVisualStyleBackColor = true;
            this.button_8.Click += new System.EventHandler(this.button_click);
            // 
            // button_5
            // 
            this.button_5.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.button_5.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_5.Location = new System.Drawing.Point(82, 190);
            this.button_5.Name = "button_5";
            this.button_5.Size = new System.Drawing.Size(77, 49);
            this.button_5.TabIndex = 14;
            this.button_5.Text = "5";
            this.button_5.UseVisualStyleBackColor = true;
            this.button_5.Click += new System.EventHandler(this.button_click);
            // 
            // button_2
            // 
            this.button_2.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.button_2.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_2.Location = new System.Drawing.Point(82, 239);
            this.button_2.Name = "button_2";
            this.button_2.Size = new System.Drawing.Size(77, 49);
            this.button_2.TabIndex = 13;
            this.button_2.Text = "2";
            this.button_2.UseVisualStyleBackColor = true;
            this.button_2.Click += new System.EventHandler(this.button_click);
            // 
            // button_0
            // 
            this.button_0.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.button_0.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_0.Location = new System.Drawing.Point(6, 288);
            this.button_0.Name = "button_0";
            this.button_0.Size = new System.Drawing.Size(77, 49);
            this.button_0.TabIndex = 12;
            this.button_0.Text = "0";
            this.button_0.UseVisualStyleBackColor = true;
            this.button_0.Click += new System.EventHandler(this.button_click);
            // 
            // button_modulos
            // 
            this.button_modulos.BackColor = System.Drawing.SystemColors.Window;
            this.button_modulos.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.button_modulos.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_modulos.Location = new System.Drawing.Point(6, 92);
            this.button_modulos.Margin = new System.Windows.Forms.Padding(0);
            this.button_modulos.Name = "button_modulos";
            this.button_modulos.Size = new System.Drawing.Size(77, 49);
            this.button_modulos.TabIndex = 23;
            this.button_modulos.Text = "%";
            this.button_modulos.UseVisualStyleBackColor = false;
            this.button_modulos.Click += new System.EventHandler(this.operator_click);
            // 
            // button_7
            // 
            this.button_7.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.button_7.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_7.Location = new System.Drawing.Point(6, 141);
            this.button_7.Name = "button_7";
            this.button_7.Size = new System.Drawing.Size(77, 49);
            this.button_7.TabIndex = 21;
            this.button_7.Text = "7";
            this.button_7.UseVisualStyleBackColor = true;
            this.button_7.Click += new System.EventHandler(this.button_click);
            // 
            // button_4
            // 
            this.button_4.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.button_4.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_4.Location = new System.Drawing.Point(6, 190);
            this.button_4.Name = "button_4";
            this.button_4.Size = new System.Drawing.Size(77, 49);
            this.button_4.TabIndex = 20;
            this.button_4.Text = "4";
            this.button_4.UseVisualStyleBackColor = true;
            this.button_4.Click += new System.EventHandler(this.button_click);
            // 
            // button_1
            // 
            this.button_1.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.button_1.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_1.Location = new System.Drawing.Point(6, 239);
            this.button_1.Name = "button_1";
            this.button_1.Size = new System.Drawing.Size(77, 49);
            this.button_1.TabIndex = 19;
            this.button_1.Text = "1";
            this.button_1.UseVisualStyleBackColor = true;
            this.button_1.Click += new System.EventHandler(this.button_click);
            // 
            // textBox_result
            // 
            this.textBox_result.Font = new System.Drawing.Font("Microsoft Sans Serif", 24F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textBox_result.Location = new System.Drawing.Point(6, 27);
            this.textBox_result.Multiline = true;
            this.textBox_result.Name = "textBox_result";
            this.textBox_result.Size = new System.Drawing.Size(306, 48);
            this.textBox_result.TabIndex = 24;
            this.textBox_result.Text = "0";
            this.textBox_result.TextAlign = System.Windows.Forms.HorizontalAlignment.Right;
            // 
            // labelCurrentOperation
            // 
            this.labelCurrentOperation.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Right)));
            this.labelCurrentOperation.AutoSize = true;
            this.labelCurrentOperation.BackColor = System.Drawing.Color.Transparent;
            this.labelCurrentOperation.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelCurrentOperation.ForeColor = System.Drawing.SystemColors.ControlDark;
            this.labelCurrentOperation.Location = new System.Drawing.Point(2, 0);
            this.labelCurrentOperation.Name = "labelCurrentOperation";
            this.labelCurrentOperation.Size = new System.Drawing.Size(0, 24);
            this.labelCurrentOperation.TabIndex = 25;
            this.labelCurrentOperation.TextAlign = System.Drawing.ContentAlignment.TopRight;
            this.labelCurrentOperation.Click += new System.EventHandler(this.label1_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ButtonHighlight;
            this.ClientSize = new System.Drawing.Size(320, 353);
            this.Controls.Add(this.labelCurrentOperation);
            this.Controls.Add(this.textBox_result);
            this.Controls.Add(this.button_modulos);
            this.Controls.Add(this.button_7);
            this.Controls.Add(this.button_4);
            this.Controls.Add(this.button_1);
            this.Controls.Add(this.button_ce);
            this.Controls.Add(this.button_8);
            this.Controls.Add(this.button_5);
            this.Controls.Add(this.button_2);
            this.Controls.Add(this.button_0);
            this.Controls.Add(this.button_c);
            this.Controls.Add(this.button_9);
            this.Controls.Add(this.button_6);
            this.Controls.Add(this.button_3);
            this.Controls.Add(this.button12);
            this.Controls.Add(this.button_back);
            this.Controls.Add(this.button_divide);
            this.Controls.Add(this.button_multiply);
            this.Controls.Add(this.button_minus);
            this.Controls.Add(this.button_equal);
            this.ForeColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Shady\'s Calculator";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button button_equal;
        private System.Windows.Forms.Button button_minus;
        private System.Windows.Forms.Button button_multiply;
        private System.Windows.Forms.Button button_divide;
        private System.Windows.Forms.Button button_back;
        private System.Windows.Forms.Button button_c;
        private System.Windows.Forms.Button button_9;
        private System.Windows.Forms.Button button_6;
        private System.Windows.Forms.Button button_3;
        private System.Windows.Forms.Button button12;
        private System.Windows.Forms.Button button_ce;
        private System.Windows.Forms.Button button_8;
        private System.Windows.Forms.Button button_5;
        private System.Windows.Forms.Button button_2;
        private System.Windows.Forms.Button button_0;
        private System.Windows.Forms.Button button_modulos;
        private System.Windows.Forms.Button button_7;
        private System.Windows.Forms.Button button_4;
        private System.Windows.Forms.Button button_1;
        private System.Windows.Forms.TextBox textBox_result;
        private System.Windows.Forms.Label labelCurrentOperation;
    }
}

