// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Message.Outputs
{

    [OutputType]
    public sealed class GetServiceQueuesQueueResult
    {
        /// <summary>
        /// The total number of messages that are in the Active state in the queue. The value is an approximate number.
        /// </summary>
        public readonly int ActiveMessages;
        /// <summary>
        /// The time when the queue was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
        /// </summary>
        public readonly int CreateTime;
        /// <summary>
        /// The total number of the messages that are in the Delayed state in the queue. The value is an approximate number.
        /// </summary>
        public readonly int DelayMessages;
        /// <summary>
        /// The delay period after which all messages that are sent to the queue can be consumed. Unit: seconds.
        /// </summary>
        public readonly int DelaySeconds;
        /// <summary>
        /// The ID of the Queue. Its value is same as Queue Name.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The total number of the messages that are in the Inactive state in the queue. The value is an approximate number.
        /// </summary>
        public readonly int InactiveMessages;
        /// <summary>
        /// The time when the queue was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
        /// </summary>
        public readonly int LastModifyTime;
        /// <summary>
        /// Indicates whether the log management feature is enabled for the queue.
        /// </summary>
        public readonly bool LoggingEnabled;
        /// <summary>
        /// The maximum size of a message body that can be sent to the queue. Unit: bytes.
        /// </summary>
        public readonly int MaximumMessageSize;
        /// <summary>
        /// The maximum period for which a message can be retained in the queue. A message that is sent to the queue can be retained for a specified period. After the specified period ends, the message is deleted no matter whether it is consumed. Unit: seconds.
        /// </summary>
        public readonly int MessageRetentionPeriod;
        /// <summary>
        /// The maximum period for which a ReceiveMessage request waits if no message is available in the queue. Unit: seconds.
        /// </summary>
        public readonly int PollingWaitSeconds;
        /// <summary>
        /// The internal url of the queue.
        /// </summary>
        public readonly string QueueInternalUrl;
        /// <summary>
        /// The name of the queue.
        /// </summary>
        public readonly string QueueName;
        /// <summary>
        /// The url of the queue.
        /// </summary>
        public readonly string QueueUrl;
        /// <summary>
        /// The invisibility period for which the received message remains the Inactive state. Unit: seconds.
        /// </summary>
        public readonly int VisibilityTimeout;

        [OutputConstructor]
        private GetServiceQueuesQueueResult(
            int activeMessages,

            int createTime,

            int delayMessages,

            int delaySeconds,

            string id,

            int inactiveMessages,

            int lastModifyTime,

            bool loggingEnabled,

            int maximumMessageSize,

            int messageRetentionPeriod,

            int pollingWaitSeconds,

            string queueInternalUrl,

            string queueName,

            string queueUrl,

            int visibilityTimeout)
        {
            ActiveMessages = activeMessages;
            CreateTime = createTime;
            DelayMessages = delayMessages;
            DelaySeconds = delaySeconds;
            Id = id;
            InactiveMessages = inactiveMessages;
            LastModifyTime = lastModifyTime;
            LoggingEnabled = loggingEnabled;
            MaximumMessageSize = maximumMessageSize;
            MessageRetentionPeriod = messageRetentionPeriod;
            PollingWaitSeconds = pollingWaitSeconds;
            QueueInternalUrl = queueInternalUrl;
            QueueName = queueName;
            QueueUrl = queueUrl;
            VisibilityTimeout = visibilityTimeout;
        }
    }
}
