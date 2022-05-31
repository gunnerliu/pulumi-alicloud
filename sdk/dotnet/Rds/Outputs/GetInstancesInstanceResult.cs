// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds.Outputs
{

    [OutputType]
    public sealed class GetInstancesInstanceResult
    {
        /// <summary>
        /// (Available in 1.124.1+) The method that is used to verify the identities of clients. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. Valid values:
        /// - cert
        /// - perfer
        /// - verify-ca
        /// - verify-full (supported only when the instance runs PostgreSQL 12 or later)
        /// </summary>
        public readonly string Acl;
        /// <summary>
        /// Availability zone.
        /// </summary>
        public readonly string AvailabilityZone;
        /// <summary>
        /// (Available in 1.124.1+) The type of the server certificate. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. Valid values:
        /// - aliyun: a cloud certificate
        /// - custom: a custom certificate
        /// </summary>
        public readonly string CaType;
        /// <summary>
        /// Billing method. Value options: `Postpaid` for Pay-As-You-Go and `Prepaid` for subscription.
        /// </summary>
        public readonly string ChargeType;
        /// <summary>
        /// (Available in 1.124.1+) The public key of the CA that issues client certificates. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs.
        /// </summary>
        public readonly string ClientCaCert;
        public readonly string ClientCaCertExpireTime;
        /// <summary>
        /// (Available in 1.124.1+) The certificate revocation list (CRL) that contains revoked client certificates. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs.
        /// </summary>
        public readonly string ClientCertRevocationList;
        /// <summary>
        /// `Standard` for standard access mode and `Safe` for high security access mode.
        /// </summary>
        public readonly string ConnectionMode;
        /// <summary>
        /// (Available in 1.70.3+) RDS database connection string.
        /// </summary>
        public readonly string ConnectionString;
        /// <summary>
        /// Creation time of the instance.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// (Available in 1.124.3+) The creator of the encryption key.
        /// </summary>
        public readonly string Creator;
        /// <summary>
        /// (Available in 1.70.3+) The storage type of the instance.
        /// </summary>
        public readonly string DbInstanceStorageType;
        /// <summary>
        /// `Primary` for primary instance, `Readonly` for read-only instance, `Guard` for disaster recovery instance, and `Temp` for temporary instance.
        /// </summary>
        public readonly string DbType;
        /// <summary>
        /// (Available in 1.124.3+) The estimated time when the encryption key will be deleted. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        /// </summary>
        public readonly string DeleteDate;
        /// <summary>
        /// (Available in 1.167.0+) Indicates whether the release protection feature is enabled for the instance. Valid values:
        /// * **true**: The release protection feature is enabled.
        /// * **false**: The release protection feature is disabled.
        /// </summary>
        public readonly bool DeletionProtection;
        /// <summary>
        /// (Available in 1.124.3+) The description of the encryption key.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (Available in 1.124.3+) The ID of the encryption key.
        /// </summary>
        public readonly string EncryptionKey;
        /// <summary>
        /// (Available in 1.124.3+) The status of the encryption key. Valid values:
        /// - Enabled
        /// - Disabled
        /// </summary>
        public readonly string EncryptionKeyStatus;
        /// <summary>
        /// Database type. Options are `MySQL`, `SQLServer`, `PostgreSQL` and `PPAS`. If no value is specified, all types are returned.
        /// </summary>
        public readonly string Engine;
        /// <summary>
        /// Database version.
        /// </summary>
        public readonly string EngineVersion;
        /// <summary>
        /// Expiration time. Pay-As-You-Go instances never expire.
        /// </summary>
        public readonly string ExpireTime;
        /// <summary>
        /// If a disaster recovery instance is attached to the current instance, the ID of the disaster recovery instance applies.
        /// </summary>
        public readonly string GuardInstanceId;
        /// <summary>
        /// The ID of the RDS instance.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Available in 1.70.3+) User-defined DB instance storage space.
        /// </summary>
        public readonly int InstanceStorage;
        /// <summary>
        /// Sizing of the RDS instance.
        /// </summary>
        public readonly string InstanceType;
        /// <summary>
        /// (Available in 1.124.3+) The purpose of the encryption key.
        /// </summary>
        public readonly string KeyUsage;
        /// <summary>
        /// (Available in 1.124.1+) The status of the SSL link. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. Valid values:
        /// - success
        /// - setting
        /// - failed
        /// </summary>
        public readonly string LastModifyStatus;
        /// <summary>
        /// ID of the primary instance. If this parameter is not returned, the current instance is a primary instance.
        /// </summary>
        public readonly string MasterInstanceId;
        /// <summary>
        /// (Available in 1.101.0+) The master zone of the instance.
        /// </summary>
        public readonly string MasterZone;
        /// <summary>
        /// (Available in 1.124.3+) The time when the encryption key expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        /// </summary>
        public readonly string MaterialExpireTime;
        /// <summary>
        /// (Available in 1.124.1+) The reason why the SSL link stays in the current state. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs.
        /// </summary>
        public readonly string ModifyStatusReason;
        /// <summary>
        /// The name of the RDS instance.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// `Internet` for public network or `Intranet` for private network.
        /// </summary>
        public readonly string NetType;
        /// <summary>
        /// (Available in 1.124.3+) The source of the encryption key.
        /// </summary>
        public readonly string Origin;
        /// <summary>
        /// (Available in 1.135.0+) Parameter list.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstancesInstanceParameterResult> Parameters;
        /// <summary>
        /// (Available in 1.70.3+) RDS database connection port.
        /// </summary>
        public readonly string Port;
        /// <summary>
        /// A list of IDs of read-only instances attached to the primary instance.
        /// </summary>
        public readonly ImmutableArray<string> ReadonlyInstanceIds;
        /// <summary>
        /// Region ID the instance belongs to.
        /// </summary>
        public readonly string RegionId;
        /// <summary>
        /// (Available in 1.124.1+) The method that is used to verify the replication permission. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. Valid values:
        /// - cert
        /// - perfer
        /// - verify-ca
        /// - verify-full (supported only when the instance runs PostgreSQL 12 or later)
        /// </summary>
        public readonly string ReplicationAcl;
        /// <summary>
        /// (Available in 1.124.1+) Indicates whether the server certificate needs to be updated.
        /// - Valid values for ApsaraDB RDS for MySQL and ApsaraDB RDS for SQL Server:
        /// - No
        /// - Yes
        /// - Valid values for ApsaraDB RDS for PostgreSQL:
        /// - 0: no
        /// - 1: yes
        /// </summary>
        public readonly string RequireUpdate;
        /// <summary>
        /// (Available in 1.124.1+) The server certificate that needs to be updated. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs.
        /// </summary>
        public readonly string RequireUpdateItem;
        /// <summary>
        /// (Available in 1.124.1+) The reason why the server certificate needs to be updated. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs.
        /// </summary>
        public readonly string RequireUpdateReason;
        /// <summary>
        /// (Available in 1.124.1+) The URL of the CA that issues the server certificate. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs.
        /// </summary>
        public readonly string ServerCaUrl;
        /// <summary>
        /// (Available in 1.124.1+) The content of the server certificate. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs.
        /// </summary>
        public readonly string ServerCert;
        /// <summary>
        /// (Available in 1.124.1+) The private key of the server certificate. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs.
        /// </summary>
        public readonly string ServerKey;
        /// <summary>
        /// (Available in 1.124.1+) The time when the server certificate was created. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. In addition, this parameter is valid only when the CAType parameter is set to aliyun.
        /// </summary>
        public readonly string SslCreateTime;
        /// <summary>
        /// (Available in 1.124.1+) Indicates whether SSL encryption is enabled. Valid values:
        /// - on: enabled
        /// - off: disabled
        /// </summary>
        public readonly string SslEnabled;
        /// <summary>
        /// (Available in 1.124.1+) The time when the server certificate expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        /// </summary>
        public readonly string SslExpireTime;
        /// <summary>
        /// Status of the instance.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// If a temporary instance is attached to the current instance, the ID of the temporary instance applies.
        /// </summary>
        public readonly string TempInstanceId;
        /// <summary>
        /// Used to retrieve instances belong to specified VPC.
        /// </summary>
        public readonly string VpcId;
        /// <summary>
        /// Used to retrieve instances belong to specified `vswitch` resources.
        /// </summary>
        public readonly string VswitchId;
        /// <summary>
        /// (Available in 1.101.0+) The region ID of the secondary instance if you create a secondary instance. If you set this parameter to the same value as the ZoneId parameter, the instance is deployed in a single zone. Otherwise, the instance is deployed in multiple zones.
        /// </summary>
        public readonly string ZoneIdSlaveA;
        /// <summary>
        /// (Available in 1.101.0+) The region ID of the log instance if you create a log instance. If you set this parameter to the same value as the ZoneId parameter, the instance is deployed in a single zone. Otherwise, the instance is deployed in multiple zones.
        /// </summary>
        public readonly string ZoneIdSlaveB;

        [OutputConstructor]
        private GetInstancesInstanceResult(
            string acl,

            string availabilityZone,

            string caType,

            string chargeType,

            string clientCaCert,

            string clientCaCertExpireTime,

            string clientCertRevocationList,

            string connectionMode,

            string connectionString,

            string createTime,

            string creator,

            string dbInstanceStorageType,

            string dbType,

            string deleteDate,

            bool deletionProtection,

            string description,

            string encryptionKey,

            string encryptionKeyStatus,

            string engine,

            string engineVersion,

            string expireTime,

            string guardInstanceId,

            string id,

            int instanceStorage,

            string instanceType,

            string keyUsage,

            string lastModifyStatus,

            string masterInstanceId,

            string masterZone,

            string materialExpireTime,

            string modifyStatusReason,

            string name,

            string netType,

            string origin,

            ImmutableArray<Outputs.GetInstancesInstanceParameterResult> parameters,

            string port,

            ImmutableArray<string> readonlyInstanceIds,

            string regionId,

            string replicationAcl,

            string requireUpdate,

            string requireUpdateItem,

            string requireUpdateReason,

            string serverCaUrl,

            string serverCert,

            string serverKey,

            string sslCreateTime,

            string sslEnabled,

            string sslExpireTime,

            string status,

            string tempInstanceId,

            string vpcId,

            string vswitchId,

            string zoneIdSlaveA,

            string zoneIdSlaveB)
        {
            Acl = acl;
            AvailabilityZone = availabilityZone;
            CaType = caType;
            ChargeType = chargeType;
            ClientCaCert = clientCaCert;
            ClientCaCertExpireTime = clientCaCertExpireTime;
            ClientCertRevocationList = clientCertRevocationList;
            ConnectionMode = connectionMode;
            ConnectionString = connectionString;
            CreateTime = createTime;
            Creator = creator;
            DbInstanceStorageType = dbInstanceStorageType;
            DbType = dbType;
            DeleteDate = deleteDate;
            DeletionProtection = deletionProtection;
            Description = description;
            EncryptionKey = encryptionKey;
            EncryptionKeyStatus = encryptionKeyStatus;
            Engine = engine;
            EngineVersion = engineVersion;
            ExpireTime = expireTime;
            GuardInstanceId = guardInstanceId;
            Id = id;
            InstanceStorage = instanceStorage;
            InstanceType = instanceType;
            KeyUsage = keyUsage;
            LastModifyStatus = lastModifyStatus;
            MasterInstanceId = masterInstanceId;
            MasterZone = masterZone;
            MaterialExpireTime = materialExpireTime;
            ModifyStatusReason = modifyStatusReason;
            Name = name;
            NetType = netType;
            Origin = origin;
            Parameters = parameters;
            Port = port;
            ReadonlyInstanceIds = readonlyInstanceIds;
            RegionId = regionId;
            ReplicationAcl = replicationAcl;
            RequireUpdate = requireUpdate;
            RequireUpdateItem = requireUpdateItem;
            RequireUpdateReason = requireUpdateReason;
            ServerCaUrl = serverCaUrl;
            ServerCert = serverCert;
            ServerKey = serverKey;
            SslCreateTime = sslCreateTime;
            SslEnabled = sslEnabled;
            SslExpireTime = sslExpireTime;
            Status = status;
            TempInstanceId = tempInstanceId;
            VpcId = vpcId;
            VswitchId = vswitchId;
            ZoneIdSlaveA = zoneIdSlaveA;
            ZoneIdSlaveB = zoneIdSlaveB;
        }
    }
}
