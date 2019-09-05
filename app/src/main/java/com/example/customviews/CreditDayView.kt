package com.example.customviews

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.credit_day_view.view.*


class CreditDayView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attributeSet, defStyleAttr) {

    var title: String = ""
        set(value) {
            field = value
            titleTV.text = field
        }
    var sales: String = ""
        set(value) {
            field = value
            salesTV.text = field
        }
    var repayment: String = ""
        set(value) {
            field = value
            repaymentTV.text = field
        }
    var overpayment: String = ""
        set(value) {
            field = value
            overpaymentTV.text = field
        }

    init {
        setLayerType(View.LAYER_TYPE_SOFTWARE, null)
        inflate(context, R.layout.credit_day_view, this)

    }

}
