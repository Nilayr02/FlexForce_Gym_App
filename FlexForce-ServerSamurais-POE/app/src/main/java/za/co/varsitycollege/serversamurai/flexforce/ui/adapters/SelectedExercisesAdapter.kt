package za.co.varsitycollege.serversamurai.flexforce.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import za.co.varsitycollege.serversamurai.flexforce.R
import za.co.varsitycollege.serversamurai.flexforce.data.models.ExerciseEntity

class SelectedExerciseAdapter(private val exerciseEntities: List<ExerciseEntity>) :
    RecyclerView.Adapter<SelectedExerciseAdapter.ExerciseViewHolder>() {

    class ExerciseViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvExerciseName: TextView = view.findViewById(R.id.tv_exercise_name)
        val tvSetsReps: TextView = view.findViewById(R.id.tv_sets_reps)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_selected_exercise, parent, false)
        return ExerciseViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExerciseViewHolder, position: Int) {
        val exercise = exerciseEntities[position]
        holder.tvExerciseName.text = exercise.name
        holder.tvSetsReps.text = "${exercise.sets} sets x ${exercise.reps} reps"
    }

    override fun getItemCount(): Int {
        return exerciseEntities.size
    }
}

