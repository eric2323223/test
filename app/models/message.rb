class Message < ActiveRecord::Base
	belongs_to :sender, :class_name=>'User', :foreign_key=>'sender_id'
    belongs_to :receiver, :class_name=>'User', :foreign_key=>'receiver_id'
    
    def read!
    	self.read = true
    	self.save
    end

	def unread!
		self.read = false
		self.save
	end
end
