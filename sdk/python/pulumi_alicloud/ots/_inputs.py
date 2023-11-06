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
    'SearchIndexSchemaArgs',
    'SearchIndexSchemaFieldSchemaArgs',
    'SearchIndexSchemaIndexSettingArgs',
    'SearchIndexSchemaIndexSortArgs',
    'SearchIndexSchemaIndexSortSorterArgs',
    'TableDefinedColumnArgs',
    'TablePrimaryKeyArgs',
    'TunnelChannelArgs',
]

@pulumi.input_type
class SearchIndexSchemaArgs:
    def __init__(__self__, *,
                 field_schemas: pulumi.Input[Sequence[pulumi.Input['SearchIndexSchemaFieldSchemaArgs']]],
                 index_settings: Optional[pulumi.Input[Sequence[pulumi.Input['SearchIndexSchemaIndexSettingArgs']]]] = None,
                 index_sorts: Optional[pulumi.Input[Sequence[pulumi.Input['SearchIndexSchemaIndexSortArgs']]]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input['SearchIndexSchemaFieldSchemaArgs']]] field_schemas: A list of field schemas. See `field_schema` below.
        :param pulumi.Input[Sequence[pulumi.Input['SearchIndexSchemaIndexSettingArgs']]] index_settings: The settings of the search index, including routingFields. See `index_setting` below.
        :param pulumi.Input[Sequence[pulumi.Input['SearchIndexSchemaIndexSortArgs']]] index_sorts: The presorting settings of the search index, including sorters. If no value is specified for the indexSort parameter, field values are sorted by primary key by default. See `index_sort` below.
        """
        SearchIndexSchemaArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            field_schemas=field_schemas,
            index_settings=index_settings,
            index_sorts=index_sorts,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             field_schemas: Optional[pulumi.Input[Sequence[pulumi.Input['SearchIndexSchemaFieldSchemaArgs']]]] = None,
             index_settings: Optional[pulumi.Input[Sequence[pulumi.Input['SearchIndexSchemaIndexSettingArgs']]]] = None,
             index_sorts: Optional[pulumi.Input[Sequence[pulumi.Input['SearchIndexSchemaIndexSortArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if field_schemas is None and 'fieldSchemas' in kwargs:
            field_schemas = kwargs['fieldSchemas']
        if field_schemas is None:
            raise TypeError("Missing 'field_schemas' argument")
        if index_settings is None and 'indexSettings' in kwargs:
            index_settings = kwargs['indexSettings']
        if index_sorts is None and 'indexSorts' in kwargs:
            index_sorts = kwargs['indexSorts']

        _setter("field_schemas", field_schemas)
        if index_settings is not None:
            _setter("index_settings", index_settings)
        if index_sorts is not None:
            _setter("index_sorts", index_sorts)

    @property
    @pulumi.getter(name="fieldSchemas")
    def field_schemas(self) -> pulumi.Input[Sequence[pulumi.Input['SearchIndexSchemaFieldSchemaArgs']]]:
        """
        A list of field schemas. See `field_schema` below.
        """
        return pulumi.get(self, "field_schemas")

    @field_schemas.setter
    def field_schemas(self, value: pulumi.Input[Sequence[pulumi.Input['SearchIndexSchemaFieldSchemaArgs']]]):
        pulumi.set(self, "field_schemas", value)

    @property
    @pulumi.getter(name="indexSettings")
    def index_settings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SearchIndexSchemaIndexSettingArgs']]]]:
        """
        The settings of the search index, including routingFields. See `index_setting` below.
        """
        return pulumi.get(self, "index_settings")

    @index_settings.setter
    def index_settings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SearchIndexSchemaIndexSettingArgs']]]]):
        pulumi.set(self, "index_settings", value)

    @property
    @pulumi.getter(name="indexSorts")
    def index_sorts(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SearchIndexSchemaIndexSortArgs']]]]:
        """
        The presorting settings of the search index, including sorters. If no value is specified for the indexSort parameter, field values are sorted by primary key by default. See `index_sort` below.
        """
        return pulumi.get(self, "index_sorts")

    @index_sorts.setter
    def index_sorts(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SearchIndexSchemaIndexSortArgs']]]]):
        pulumi.set(self, "index_sorts", value)


@pulumi.input_type
class SearchIndexSchemaFieldSchemaArgs:
    def __init__(__self__, *,
                 field_name: pulumi.Input[str],
                 field_type: pulumi.Input[str],
                 analyzer: Optional[pulumi.Input[str]] = None,
                 enable_sort_and_agg: Optional[pulumi.Input[bool]] = None,
                 index: Optional[pulumi.Input[bool]] = None,
                 is_array: Optional[pulumi.Input[bool]] = None,
                 store: Optional[pulumi.Input[bool]] = None):
        """
        :param pulumi.Input[str] field_name: The name of the field that is used to sort data. only required if sorter_type is FieldSort.
        :param pulumi.Input[str] field_type: Specifies the type of the field. Use FieldType.XXX to set the type.
        :param pulumi.Input[str] analyzer: Specifies the type of the analyzer that you want to use. If fieldType is set to Text, you can configure this parameter. Otherwise, the default analyzer type single-word tokenization is used.
        :param pulumi.Input[bool] enable_sort_and_agg: Specifies whether to enable sorting and aggregation. Type: Boolean. Sorting can be enabled only for fields for which enable_sort_and_agg is set to true.
        :param pulumi.Input[bool] index: Specifies whether to enable indexing for the column. Type: Boolean.
        :param pulumi.Input[bool] is_array: Specifies whether the value is an array. Type: Boolean.
        :param pulumi.Input[bool] store: Specifies whether to store the value of the field in the search index. Type: Boolean. If you set store to true, you can read the value of the field from the search index without querying the data table. This improves query performance.
        """
        SearchIndexSchemaFieldSchemaArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            field_name=field_name,
            field_type=field_type,
            analyzer=analyzer,
            enable_sort_and_agg=enable_sort_and_agg,
            index=index,
            is_array=is_array,
            store=store,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             field_name: Optional[pulumi.Input[str]] = None,
             field_type: Optional[pulumi.Input[str]] = None,
             analyzer: Optional[pulumi.Input[str]] = None,
             enable_sort_and_agg: Optional[pulumi.Input[bool]] = None,
             index: Optional[pulumi.Input[bool]] = None,
             is_array: Optional[pulumi.Input[bool]] = None,
             store: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if field_name is None and 'fieldName' in kwargs:
            field_name = kwargs['fieldName']
        if field_name is None:
            raise TypeError("Missing 'field_name' argument")
        if field_type is None and 'fieldType' in kwargs:
            field_type = kwargs['fieldType']
        if field_type is None:
            raise TypeError("Missing 'field_type' argument")
        if enable_sort_and_agg is None and 'enableSortAndAgg' in kwargs:
            enable_sort_and_agg = kwargs['enableSortAndAgg']
        if is_array is None and 'isArray' in kwargs:
            is_array = kwargs['isArray']

        _setter("field_name", field_name)
        _setter("field_type", field_type)
        if analyzer is not None:
            _setter("analyzer", analyzer)
        if enable_sort_and_agg is not None:
            _setter("enable_sort_and_agg", enable_sort_and_agg)
        if index is not None:
            _setter("index", index)
        if is_array is not None:
            _setter("is_array", is_array)
        if store is not None:
            _setter("store", store)

    @property
    @pulumi.getter(name="fieldName")
    def field_name(self) -> pulumi.Input[str]:
        """
        The name of the field that is used to sort data. only required if sorter_type is FieldSort.
        """
        return pulumi.get(self, "field_name")

    @field_name.setter
    def field_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "field_name", value)

    @property
    @pulumi.getter(name="fieldType")
    def field_type(self) -> pulumi.Input[str]:
        """
        Specifies the type of the field. Use FieldType.XXX to set the type.
        """
        return pulumi.get(self, "field_type")

    @field_type.setter
    def field_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "field_type", value)

    @property
    @pulumi.getter
    def analyzer(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the type of the analyzer that you want to use. If fieldType is set to Text, you can configure this parameter. Otherwise, the default analyzer type single-word tokenization is used.
        """
        return pulumi.get(self, "analyzer")

    @analyzer.setter
    def analyzer(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "analyzer", value)

    @property
    @pulumi.getter(name="enableSortAndAgg")
    def enable_sort_and_agg(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to enable sorting and aggregation. Type: Boolean. Sorting can be enabled only for fields for which enable_sort_and_agg is set to true.
        """
        return pulumi.get(self, "enable_sort_and_agg")

    @enable_sort_and_agg.setter
    def enable_sort_and_agg(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_sort_and_agg", value)

    @property
    @pulumi.getter
    def index(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to enable indexing for the column. Type: Boolean.
        """
        return pulumi.get(self, "index")

    @index.setter
    def index(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "index", value)

    @property
    @pulumi.getter(name="isArray")
    def is_array(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the value is an array. Type: Boolean.
        """
        return pulumi.get(self, "is_array")

    @is_array.setter
    def is_array(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_array", value)

    @property
    @pulumi.getter
    def store(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to store the value of the field in the search index. Type: Boolean. If you set store to true, you can read the value of the field from the search index without querying the data table. This improves query performance.
        """
        return pulumi.get(self, "store")

    @store.setter
    def store(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "store", value)


@pulumi.input_type
class SearchIndexSchemaIndexSettingArgs:
    def __init__(__self__, *,
                 routing_fields: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input[str]]] routing_fields: Specifies custom routing fields. You can specify some primary key columns as routing fields. Tablestore distributes data that is written to a search index across different partitions based on the specified routing fields. The data whose routing field values are the same is distributed to the same partition.
        """
        SearchIndexSchemaIndexSettingArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            routing_fields=routing_fields,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             routing_fields: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if routing_fields is None and 'routingFields' in kwargs:
            routing_fields = kwargs['routingFields']

        if routing_fields is not None:
            _setter("routing_fields", routing_fields)

    @property
    @pulumi.getter(name="routingFields")
    def routing_fields(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Specifies custom routing fields. You can specify some primary key columns as routing fields. Tablestore distributes data that is written to a search index across different partitions based on the specified routing fields. The data whose routing field values are the same is distributed to the same partition.
        """
        return pulumi.get(self, "routing_fields")

    @routing_fields.setter
    def routing_fields(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "routing_fields", value)


@pulumi.input_type
class SearchIndexSchemaIndexSortArgs:
    def __init__(__self__, *,
                 sorters: pulumi.Input[Sequence[pulumi.Input['SearchIndexSchemaIndexSortSorterArgs']]]):
        """
        :param pulumi.Input[Sequence[pulumi.Input['SearchIndexSchemaIndexSortSorterArgs']]] sorters: Specifies the presorting method for the search index. PrimaryKeySort and FieldSort are supported. See `sorter` below.
        """
        SearchIndexSchemaIndexSortArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            sorters=sorters,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             sorters: Optional[pulumi.Input[Sequence[pulumi.Input['SearchIndexSchemaIndexSortSorterArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if sorters is None:
            raise TypeError("Missing 'sorters' argument")

        _setter("sorters", sorters)

    @property
    @pulumi.getter
    def sorters(self) -> pulumi.Input[Sequence[pulumi.Input['SearchIndexSchemaIndexSortSorterArgs']]]:
        """
        Specifies the presorting method for the search index. PrimaryKeySort and FieldSort are supported. See `sorter` below.
        """
        return pulumi.get(self, "sorters")

    @sorters.setter
    def sorters(self, value: pulumi.Input[Sequence[pulumi.Input['SearchIndexSchemaIndexSortSorterArgs']]]):
        pulumi.set(self, "sorters", value)


@pulumi.input_type
class SearchIndexSchemaIndexSortSorterArgs:
    def __init__(__self__, *,
                 field_name: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 order: Optional[pulumi.Input[str]] = None,
                 sorter_type: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] field_name: The name of the field that is used to sort data. only required if sorter_type is FieldSort.
        :param pulumi.Input[str] mode: The sorting method that is used when the field contains multiple values. valid values: `Min`, `Max`, `Avg`. only required if sorter_type is FieldSort.
        :param pulumi.Input[str] order: The sort order. Data can be sorted in ascending(`Asc`) or descending(`Desc`) order. Default value: `Asc`.
        :param pulumi.Input[str] sorter_type: Data is sorted by Which fields or keys. valid values: `PrimaryKeySort`, `FieldSort`.
        """
        SearchIndexSchemaIndexSortSorterArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            field_name=field_name,
            mode=mode,
            order=order,
            sorter_type=sorter_type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             field_name: Optional[pulumi.Input[str]] = None,
             mode: Optional[pulumi.Input[str]] = None,
             order: Optional[pulumi.Input[str]] = None,
             sorter_type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if field_name is None and 'fieldName' in kwargs:
            field_name = kwargs['fieldName']
        if sorter_type is None and 'sorterType' in kwargs:
            sorter_type = kwargs['sorterType']

        if field_name is not None:
            _setter("field_name", field_name)
        if mode is not None:
            _setter("mode", mode)
        if order is not None:
            _setter("order", order)
        if sorter_type is not None:
            _setter("sorter_type", sorter_type)

    @property
    @pulumi.getter(name="fieldName")
    def field_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the field that is used to sort data. only required if sorter_type is FieldSort.
        """
        return pulumi.get(self, "field_name")

    @field_name.setter
    def field_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "field_name", value)

    @property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[str]]:
        """
        The sorting method that is used when the field contains multiple values. valid values: `Min`, `Max`, `Avg`. only required if sorter_type is FieldSort.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter
    def order(self) -> Optional[pulumi.Input[str]]:
        """
        The sort order. Data can be sorted in ascending(`Asc`) or descending(`Desc`) order. Default value: `Asc`.
        """
        return pulumi.get(self, "order")

    @order.setter
    def order(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "order", value)

    @property
    @pulumi.getter(name="sorterType")
    def sorter_type(self) -> Optional[pulumi.Input[str]]:
        """
        Data is sorted by Which fields or keys. valid values: `PrimaryKeySort`, `FieldSort`.
        """
        return pulumi.get(self, "sorter_type")

    @sorter_type.setter
    def sorter_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sorter_type", value)


@pulumi.input_type
class TableDefinedColumnArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 type: pulumi.Input[str]):
        """
        :param pulumi.Input[str] name: Name for defined column.
        :param pulumi.Input[str] type: Type for defined column. `Integer`, `String`, `Binary`, `Double`, `Boolean` is allowed.
        """
        TableDefinedColumnArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            name=name,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             name: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if name is None:
            raise TypeError("Missing 'name' argument")
        if type is None:
            raise TypeError("Missing 'type' argument")

        _setter("name", name)
        _setter("type", type)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        Name for defined column.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Type for defined column. `Integer`, `String`, `Binary`, `Double`, `Boolean` is allowed.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class TablePrimaryKeyArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 type: pulumi.Input[str]):
        """
        :param pulumi.Input[str] name: Name for primary key.
        :param pulumi.Input[str] type: Type for primary key. Only `Integer`, `String` or `Binary` is allowed.
        """
        TablePrimaryKeyArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            name=name,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             name: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if name is None:
            raise TypeError("Missing 'name' argument")
        if type is None:
            raise TypeError("Missing 'type' argument")

        _setter("name", name)
        _setter("type", type)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        Name for primary key.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Type for primary key. Only `Integer`, `String` or `Binary` is allowed.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class TunnelChannelArgs:
    def __init__(__self__, *,
                 channel_id: Optional[pulumi.Input[str]] = None,
                 channel_rpo: Optional[pulumi.Input[int]] = None,
                 channel_status: Optional[pulumi.Input[str]] = None,
                 channel_type: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] channel_id: The id of the channel.
        :param pulumi.Input[int] channel_rpo: The latest consumption time of the channel, unix time in nanosecond.
        :param pulumi.Input[str] channel_status: The status of the channel, valid values: `WAIT`, `OPEN`, `CLOSING`, `CLOSE`, `TERMINATED`.
        :param pulumi.Input[str] channel_type: The type of the channel, valid values: `BaseData`, `Stream`.
        :param pulumi.Input[str] client_id: The client id of the channel.
        """
        TunnelChannelArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            channel_id=channel_id,
            channel_rpo=channel_rpo,
            channel_status=channel_status,
            channel_type=channel_type,
            client_id=client_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             channel_id: Optional[pulumi.Input[str]] = None,
             channel_rpo: Optional[pulumi.Input[int]] = None,
             channel_status: Optional[pulumi.Input[str]] = None,
             channel_type: Optional[pulumi.Input[str]] = None,
             client_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if channel_id is None and 'channelId' in kwargs:
            channel_id = kwargs['channelId']
        if channel_rpo is None and 'channelRpo' in kwargs:
            channel_rpo = kwargs['channelRpo']
        if channel_status is None and 'channelStatus' in kwargs:
            channel_status = kwargs['channelStatus']
        if channel_type is None and 'channelType' in kwargs:
            channel_type = kwargs['channelType']
        if client_id is None and 'clientId' in kwargs:
            client_id = kwargs['clientId']

        if channel_id is not None:
            _setter("channel_id", channel_id)
        if channel_rpo is not None:
            _setter("channel_rpo", channel_rpo)
        if channel_status is not None:
            _setter("channel_status", channel_status)
        if channel_type is not None:
            _setter("channel_type", channel_type)
        if client_id is not None:
            _setter("client_id", client_id)

    @property
    @pulumi.getter(name="channelId")
    def channel_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the channel.
        """
        return pulumi.get(self, "channel_id")

    @channel_id.setter
    def channel_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "channel_id", value)

    @property
    @pulumi.getter(name="channelRpo")
    def channel_rpo(self) -> Optional[pulumi.Input[int]]:
        """
        The latest consumption time of the channel, unix time in nanosecond.
        """
        return pulumi.get(self, "channel_rpo")

    @channel_rpo.setter
    def channel_rpo(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "channel_rpo", value)

    @property
    @pulumi.getter(name="channelStatus")
    def channel_status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the channel, valid values: `WAIT`, `OPEN`, `CLOSING`, `CLOSE`, `TERMINATED`.
        """
        return pulumi.get(self, "channel_status")

    @channel_status.setter
    def channel_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "channel_status", value)

    @property
    @pulumi.getter(name="channelType")
    def channel_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the channel, valid values: `BaseData`, `Stream`.
        """
        return pulumi.get(self, "channel_type")

    @channel_type.setter
    def channel_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "channel_type", value)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[pulumi.Input[str]]:
        """
        The client id of the channel.
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_id", value)


