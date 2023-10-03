# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetClassDetailsResult',
    'AwaitableGetClassDetailsResult',
    'get_class_details',
    'get_class_details_output',
]

@pulumi.output_type
class GetClassDetailsResult:
    """
    A collection of values returned by getClassDetails.
    """
    def __init__(__self__, category=None, class_code=None, class_group=None, commodity_code=None, cpu=None, db_instance_storage_type=None, engine=None, engine_version=None, id=None, instruction_set_arch=None, max_connections=None, max_iombps=None, max_iops=None, memory_class=None, reference_price=None):
        if category and not isinstance(category, str):
            raise TypeError("Expected argument 'category' to be a str")
        pulumi.set(__self__, "category", category)
        if class_code and not isinstance(class_code, str):
            raise TypeError("Expected argument 'class_code' to be a str")
        pulumi.set(__self__, "class_code", class_code)
        if class_group and not isinstance(class_group, str):
            raise TypeError("Expected argument 'class_group' to be a str")
        pulumi.set(__self__, "class_group", class_group)
        if commodity_code and not isinstance(commodity_code, str):
            raise TypeError("Expected argument 'commodity_code' to be a str")
        pulumi.set(__self__, "commodity_code", commodity_code)
        if cpu and not isinstance(cpu, str):
            raise TypeError("Expected argument 'cpu' to be a str")
        pulumi.set(__self__, "cpu", cpu)
        if db_instance_storage_type and not isinstance(db_instance_storage_type, str):
            raise TypeError("Expected argument 'db_instance_storage_type' to be a str")
        pulumi.set(__self__, "db_instance_storage_type", db_instance_storage_type)
        if engine and not isinstance(engine, str):
            raise TypeError("Expected argument 'engine' to be a str")
        pulumi.set(__self__, "engine", engine)
        if engine_version and not isinstance(engine_version, str):
            raise TypeError("Expected argument 'engine_version' to be a str")
        pulumi.set(__self__, "engine_version", engine_version)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if instruction_set_arch and not isinstance(instruction_set_arch, str):
            raise TypeError("Expected argument 'instruction_set_arch' to be a str")
        pulumi.set(__self__, "instruction_set_arch", instruction_set_arch)
        if max_connections and not isinstance(max_connections, str):
            raise TypeError("Expected argument 'max_connections' to be a str")
        pulumi.set(__self__, "max_connections", max_connections)
        if max_iombps and not isinstance(max_iombps, str):
            raise TypeError("Expected argument 'max_iombps' to be a str")
        pulumi.set(__self__, "max_iombps", max_iombps)
        if max_iops and not isinstance(max_iops, str):
            raise TypeError("Expected argument 'max_iops' to be a str")
        pulumi.set(__self__, "max_iops", max_iops)
        if memory_class and not isinstance(memory_class, str):
            raise TypeError("Expected argument 'memory_class' to be a str")
        pulumi.set(__self__, "memory_class", memory_class)
        if reference_price and not isinstance(reference_price, str):
            raise TypeError("Expected argument 'reference_price' to be a str")
        pulumi.set(__self__, "reference_price", reference_price)

    @property
    @pulumi.getter
    def category(self) -> str:
        """
        The RDS edition of the instance. Valid values:
        * **Basic**: Basic Edition.
        * **HighAvailability**: High-availability Edition.
        * **AlwaysOn**: Cluster Edition.
        * **Finance**: Enterprise Edition.
        """
        return pulumi.get(self, "category")

    @property
    @pulumi.getter(name="classCode")
    def class_code(self) -> str:
        return pulumi.get(self, "class_code")

    @property
    @pulumi.getter(name="classGroup")
    def class_group(self) -> str:
        """
        The specification family.
        """
        return pulumi.get(self, "class_group")

    @property
    @pulumi.getter(name="commodityCode")
    def commodity_code(self) -> str:
        return pulumi.get(self, "commodity_code")

    @property
    @pulumi.getter
    def cpu(self) -> str:
        """
        The number of CPU cores corresponding to the instance specification. Unit: pieces.
        """
        return pulumi.get(self, "cpu")

    @property
    @pulumi.getter(name="dbInstanceStorageType")
    def db_instance_storage_type(self) -> str:
        """
        The storage type of the instance. Valid values:
        * **local_ssd**: specifies to use local SSDs.
        * **cloud_ssd**: specifies to use standard SSDs.
        * **cloud_essd**: specifies to use enhanced SSDs (ESSDs).
        * **cloud_essd2**: specifies to use enhanced SSDs (ESSDs).
        * **cloud_essd3**: specifies to use enhanced SSDs (ESSDs).
        """
        return pulumi.get(self, "db_instance_storage_type")

    @property
    @pulumi.getter
    def engine(self) -> str:
        return pulumi.get(self, "engine")

    @property
    @pulumi.getter(name="engineVersion")
    def engine_version(self) -> str:
        return pulumi.get(self, "engine_version")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instructionSetArch")
    def instruction_set_arch(self) -> str:
        """
        The architecture of the instance type.
        """
        return pulumi.get(self, "instruction_set_arch")

    @property
    @pulumi.getter(name="maxConnections")
    def max_connections(self) -> str:
        """
        The maximum number of connections.
        """
        return pulumi.get(self, "max_connections")

    @property
    @pulumi.getter(name="maxIombps")
    def max_iombps(self) -> str:
        """
        The maximum IO bandwidth corresponding to the instance specification. Unit: Mbps.
        """
        return pulumi.get(self, "max_iombps")

    @property
    @pulumi.getter(name="maxIops")
    def max_iops(self) -> str:
        """
        The maximum IOPS of the instance.
        """
        return pulumi.get(self, "max_iops")

    @property
    @pulumi.getter(name="memoryClass")
    def memory_class(self) -> str:
        """
        The memory capacity that is supported by the instance type. Unit: GB.
        """
        return pulumi.get(self, "memory_class")

    @property
    @pulumi.getter(name="referencePrice")
    def reference_price(self) -> str:
        """
        The fee that you must pay for the instance type. Unit: cent (RMB).
        """
        return pulumi.get(self, "reference_price")


class AwaitableGetClassDetailsResult(GetClassDetailsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClassDetailsResult(
            category=self.category,
            class_code=self.class_code,
            class_group=self.class_group,
            commodity_code=self.commodity_code,
            cpu=self.cpu,
            db_instance_storage_type=self.db_instance_storage_type,
            engine=self.engine,
            engine_version=self.engine_version,
            id=self.id,
            instruction_set_arch=self.instruction_set_arch,
            max_connections=self.max_connections,
            max_iombps=self.max_iombps,
            max_iops=self.max_iops,
            memory_class=self.memory_class,
            reference_price=self.reference_price)


def get_class_details(class_code: Optional[str] = None,
                      commodity_code: Optional[str] = None,
                      engine: Optional[str] = None,
                      engine_version: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClassDetailsResult:
    """
    This data source provides details of the Rds specifications of current Alibaba Cloud users.

    For information on RDS class details and how to use it, please refer to [What is RDS class details](https://www.alibabacloud.com/help/zh/apsaradb-for-rds/latest/api-rds-2014-08-15-describeclassdetails).

    > **NOTE:** Available since v1.209.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.rds.get_class_details(class_code="mysql.n4.medium.2c",
        commodity_code="bards",
        engine="MySQL",
        engine_version="8.0")
    ```


    :param str class_code: The code of the instance type.
    :param str commodity_code: The commodity code of the instance. Valid values:
           * **bards**: The instance is a pay-as-you-go primary instance. This value is available on the China site (aliyun.com).
           * **rds**: The instance is a subscription primary instance. This value is available on the China site (aliyun.com).
           * **rords**: The instance is a pay-as-you-go read-only instance. This value is available on the China site (aliyun.com).
           * **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available on the China site (aliyun.com).
           * **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available on the International site (alibabacloud.com).
           * **rds_intl**: The instance is a subscription primary instance. This value is available on the International site (alibabacloud.com).
           * **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available on the International site (alibabacloud.com).
           * **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).
    :param str engine: Database type. Value options: MySQL, SQLServer, PostgreSQL, MariaDB.
    :param str engine_version: Database version. Value options:
           - MySQL: [ 5.5、5.6、5.7、8.0 ]
           - SQLServer: [ 2008r2、08r2_ent_ha、2012、2012_ent_ha、2012_std_ha、2012_web、2014_std_ha、2016_ent_ha、2016_std_ha、2016_web、2017_std_ha、2017_ent、2019_std_ha、2019_ent ]
           - PostgreSQL: [ 10.0、11.0、12.0、13.0、14.0、15.0 ]
           - MariaDB: [ 10.3 ]
    """
    __args__ = dict()
    __args__['classCode'] = class_code
    __args__['commodityCode'] = commodity_code
    __args__['engine'] = engine
    __args__['engineVersion'] = engine_version
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:rds/getClassDetails:getClassDetails', __args__, opts=opts, typ=GetClassDetailsResult).value

    return AwaitableGetClassDetailsResult(
        category=pulumi.get(__ret__, 'category'),
        class_code=pulumi.get(__ret__, 'class_code'),
        class_group=pulumi.get(__ret__, 'class_group'),
        commodity_code=pulumi.get(__ret__, 'commodity_code'),
        cpu=pulumi.get(__ret__, 'cpu'),
        db_instance_storage_type=pulumi.get(__ret__, 'db_instance_storage_type'),
        engine=pulumi.get(__ret__, 'engine'),
        engine_version=pulumi.get(__ret__, 'engine_version'),
        id=pulumi.get(__ret__, 'id'),
        instruction_set_arch=pulumi.get(__ret__, 'instruction_set_arch'),
        max_connections=pulumi.get(__ret__, 'max_connections'),
        max_iombps=pulumi.get(__ret__, 'max_iombps'),
        max_iops=pulumi.get(__ret__, 'max_iops'),
        memory_class=pulumi.get(__ret__, 'memory_class'),
        reference_price=pulumi.get(__ret__, 'reference_price'))


@_utilities.lift_output_func(get_class_details)
def get_class_details_output(class_code: Optional[pulumi.Input[str]] = None,
                             commodity_code: Optional[pulumi.Input[str]] = None,
                             engine: Optional[pulumi.Input[str]] = None,
                             engine_version: Optional[pulumi.Input[str]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetClassDetailsResult]:
    """
    This data source provides details of the Rds specifications of current Alibaba Cloud users.

    For information on RDS class details and how to use it, please refer to [What is RDS class details](https://www.alibabacloud.com/help/zh/apsaradb-for-rds/latest/api-rds-2014-08-15-describeclassdetails).

    > **NOTE:** Available since v1.209.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.rds.get_class_details(class_code="mysql.n4.medium.2c",
        commodity_code="bards",
        engine="MySQL",
        engine_version="8.0")
    ```


    :param str class_code: The code of the instance type.
    :param str commodity_code: The commodity code of the instance. Valid values:
           * **bards**: The instance is a pay-as-you-go primary instance. This value is available on the China site (aliyun.com).
           * **rds**: The instance is a subscription primary instance. This value is available on the China site (aliyun.com).
           * **rords**: The instance is a pay-as-you-go read-only instance. This value is available on the China site (aliyun.com).
           * **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available on the China site (aliyun.com).
           * **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available on the International site (alibabacloud.com).
           * **rds_intl**: The instance is a subscription primary instance. This value is available on the International site (alibabacloud.com).
           * **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available on the International site (alibabacloud.com).
           * **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).
    :param str engine: Database type. Value options: MySQL, SQLServer, PostgreSQL, MariaDB.
    :param str engine_version: Database version. Value options:
           - MySQL: [ 5.5、5.6、5.7、8.0 ]
           - SQLServer: [ 2008r2、08r2_ent_ha、2012、2012_ent_ha、2012_std_ha、2012_web、2014_std_ha、2016_ent_ha、2016_std_ha、2016_web、2017_std_ha、2017_ent、2019_std_ha、2019_ent ]
           - PostgreSQL: [ 10.0、11.0、12.0、13.0、14.0、15.0 ]
           - MariaDB: [ 10.3 ]
    """
    ...
