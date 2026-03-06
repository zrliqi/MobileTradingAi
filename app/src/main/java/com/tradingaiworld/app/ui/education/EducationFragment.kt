package com.tradingaiworld.app.ui.education

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tradingai.app.adapters.CourseAdapter
import com.tradingai.app.databinding.FragmentEducationBinding
import com.tradingai.app.models.Course

class EducationFragment : Fragment() {

    private var _binding: FragmentEducationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEducationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val allPhases = listOf(
            Course(
                id = "1",
                title = "PHASE 1 — Python Fundamentals",
                description = "Learn the core Python skills required for algorithmic trading development.",
                topics = listOf(
                    "Python basics and clean coding",
                    "Data types and control flow",
                    "Functions and modules",
                    "Lists and dictionaries",
                    "Error handling",
                    "Project: Price & PnL Calculator",
                    "Project: Moving Average (manual)"
                ),
                videoUrl = "https://sushen.github.io/TradingAiWorld/",
                docLink = "https://sushen.github.io/TradingAiWorld/"
            ),
            Course(
                id = "2",
                title = "PHASE 2 — Python for Market Data",
                description = "Work with financial market datasets and time-series data.",
                topics = listOf(
                    "CSV and JSON data handling",
                    "NumPy basics",
                    "Pandas data analysis",
                    "Time-series processing",
                    "Data visualization",
                    "Project: OHLCV data loader",
                    "Project: Candle builder"
                ),
                videoUrl = "https://sushen.github.io/TradingAiWorld/",
                docLink = "https://sushen.github.io/TradingAiWorld/"
            ),
            Course(
                id = "3",
                title = "PHASE 3 — OOP for Trading",
                description = "Build reusable trading system components using object-oriented programming.",
                topics = listOf(
                    "Classes and objects",
                    "Inheritance and polymorphism",
                    "SOLID design principles",
                    "Trading Models: Candle, Order, Position",
                    "Systems: Portfolio & Risk Manager"
                ),
                videoUrl = "https://sushen.github.io/TradingAiWorld/",
                docLink = "https://sushen.github.io/TradingAiWorld/"
            ),
            Course(
                id = "4",
                title = "PHASE 4 — Design Patterns",
                description = "Learn professional software architecture used in trading systems.",
                topics = listOf(
                    "Singleton, Factory & Strategy patterns",
                    "Adapter & Observer patterns",
                    "Event-driven system design",
                    "Project: Paper trading exchange adapter"
                ),
                videoUrl = "https://sushen.github.io/TradingAiWorld/",
                docLink = "https://sushen.github.io/TradingAiWorld/"
            ),
            Course(
                id = "5",
                title = "PHASE 5 — Trading System Design",
                description = "Build the core engine of an automated trading system.",
                topics = listOf(
                    "Strategy logic and indicators",
                    "Risk management systems",
                    "Trade execution engine",
                    "Backtesting framework",
                    "REST APIs & WebSocket streaming"
                ),
                videoUrl = "https://sushen.github.io/TradingAiWorld/",
                docLink = "https://sushen.github.io/TradingAiWorld/"
            ),
            Course(
                id = "6",
                title = "PHASE 6 — Production Engineering",
                description = "Prepare trading systems for real production environments.",
                topics = listOf(
                    "Clean project architecture",
                    "Logging and monitoring",
                    "Unit & Integration testing",
                    "Performance optimization",
                    "Strategy optimization"
                ),
                videoUrl = "https://sushen.github.io/TradingAiWorld/",
                docLink = "https://sushen.github.io/TradingAiWorld/"
            ),
            Course(
                id = "7",
                title = "PHASE 7 — Android Trading Apps",
                description = "Build a mobile application to monitor and control the trading system.",
                topics = listOf(
                    "Android Studio & Kotlin fundamentals",
                    "UI layout design (Material 3)",
                    "REST API & WebSocket communication",
                    "Notifications & Real-time updates"
                ),
                videoUrl = "https://sushen.github.io/TradingAiWorld/",
                docLink = "https://sushen.github.io/TradingAiWorld/"
            )
        )
        binding.rvCourses.layoutManager = LinearLayoutManager(context)
        binding.rvCourses.adapter = CourseAdapter(allPhases)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
