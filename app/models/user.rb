class User < ActiveRecord::Base
	has_many :sent_messages, :class_name => "Message", :foreign_key => "sender_id"
  	has_many :received_messages, :class_name => "Message", :foreign_key => "receiver_id"
  	
  	validates_confirmation_of :password
  	validates_uniqueness_of	:name
  	validates_presence_of :name, :password, :password_confirmation
  	
  	
  	def get_unread_message_count
  		self.get_unread_messages.length
  	end
  	
  	def get_unread_messages
  		unread_messages = []
  		self.received_messages.each do |msg|
  			if msg.read == false
  				unread_messages << msg
  			end
  		end
  		unread_messages
  	end
end
